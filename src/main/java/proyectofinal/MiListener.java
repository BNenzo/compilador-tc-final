package proyectofinal;

import java.util.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MiListener extends idBaseListener {
  private Boolean error = false;
  private TipoDato tipoDatoActual;

  private HashMap<String, List<MiId>> declaracionFuncionesStorage;
  private String declaracionFuncionUltimoNombre;
  private String tokenTemporal;
  private boolean addContextFlag = true;
  private Integer contextCount = 0;
  private Integer aux_parameterCount = 0;
  private MiId aux_id = new MiId();

  private List<TipoDato> listaTipoDatos;

  MiListener(idParser parser) {
    declaracionFuncionesStorage = new HashMap<String, List<MiId>>();
    listaTipoDatos = new ArrayList<TipoDato>();
  }

  public Boolean getError() {
    return error;
  }

  @Override
  public void enterBloque(idParser.BloqueContext ctx) {
    if (!addContextFlag) {
      addContextFlag = true;
      return;
    }
    contextCount++;
    TablaSimbolos.getInstance().addContext();
  }

  @Override
  public void exitBloque(idParser.BloqueContext ctx) {
    if (error)
      return;

    TablaSimbolos.getInstance().displayLastContextContent(contextCount);
    TablaSimbolos.getInstance().removeLastContext();
  }

  // ---------------------------- TYPES ---------------------------

  @Override
  public void enterTypes(idParser.TypesContext ctx) {
    String token = ctx.getStart().getText();
    tipoDatoActual = getTipoDatoByToken(token);
  }

  @Override
  public void enterTypesFunciones(idParser.TypesFuncionesContext ctx) {
    tipoDatoActual = getTipoDatoByToken(ctx.getStart().getText());
  }

  /* ---------------------------- DECLARACIONES --------------------------- */
  // Variables
  @Override
  public void enterDeclararAsignacion(idParser.DeclararAsignacionContext ctx) {
    String token = ctx.getStart().getText();
    MiId id = new MiId(token, true, this.tipoDatoActual, false, false);
    TablaSimbolos.getInstance().addId(id);
    tokenTemporal = token;
  }

  @Override
  public void enterDeclararSinAsignacion(idParser.DeclararSinAsignacionContext ctx) {
    String token = ctx.getStart().getText();
    MiId id = new MiId(token, false, this.tipoDatoActual, false, false);
    TablaSimbolos.getInstance().addId(id);
    tokenTemporal = token;
  }

  // Funciones

  @Override
  public void enterDeclaracionFuncion_Nombre(idParser.DeclaracionFuncion_NombreContext ctx) {
    String token = ctx.getStart().getText();
    MiId id = new MiId(token, false, this.tipoDatoActual, false, true);
    TablaSimbolos.getInstance().addId(id);

    declaracionFuncionUltimoNombre = token;
    this.declaracionFuncionesStorage.put(token, new ArrayList<MiId>());
  }

  @Override
  public void enterDeclaracionFuncion_parametros(idParser.DeclaracionFuncion_parametrosContext ctx) {
    String token = ctx.getStart().getText();
    MiId id = new MiId("parametro", false, getTipoDatoByToken(token), false, false);
    declaracionFuncionesStorage.get(declaracionFuncionUltimoNombre).add(id);
  }

  /* ---------------------------- DEFINICIONES --------------------------- */
  // FUNCIONES
  @Override
  public void enterDefincionFuncion(idParser.DefincionFuncionContext ctx) {
    TablaSimbolos.getInstance().addContext();
    contextCount++;
    addContextFlag = false;
  }

  @Override
  public void enterDefinicionFuncion_Nombre(idParser.DefinicionFuncion_NombreContext ctx) {
    String token = ctx.getStart().getText();
    tokenTemporal = token;
    if (!TablaSimbolos.getInstance().findTokenByContextIndex(token, 0)) {
      error = true;
      System.out.println(
          "Semantic error - the token function: '" + token + "' is not declared on global context");
      return;
    }
    MiId id = TablaSimbolos.getInstance().getContextByIndex(0).get(token);
    if (!id.getTipoDato().equals(tipoDatoActual)) {
      error = true;
      System.out.println(
          "Semantic error - the token function: '" + token + "' is declared like " + id.getTipoDato()
              + " on global context and you use " + tipoDatoActual);
      return;
    }
    id.setInicializada(true);
  }

  @Override
  public void enterDefinicionFuncion_parametros_internal_rule(
      idParser.DefinicionFuncion_parametros_internal_ruleContext ctx) {
  }

  @Override
  public void enterDefinicionFuncion_parametro_nombre(idParser.DefinicionFuncion_parametro_nombreContext ctx) {
    // tokenTemporal seteado en enterDefinicionFuncion_Nombre
    List<MiId> parametros = declaracionFuncionesStorage.get(tokenTemporal);
    if (parametros == null)
      return;
    if (parametros.size() == 0)
      return;
    for (MiId parametro : parametros) {
      // validar tipos de los parametros
      if (parametro.getTipoDato() != tipoDatoActual && !parametro.getInicializada()) {
        System.out.println(
            "Semantic error - Invalid parameter type in function definition " + tokenTemporal
                + " - Parameter type expected " + parametro.getTipoDato()
                + " - received " + tipoDatoActual);
        error = true;
      }
      // validar cantidad de parametros (mas parametros que declarados)
      if (!parametro.getInicializada()) {
        parametro.setInicializada(true);
        parametro.setToken(ctx.getStart().getText());
        return;
      }
    }
    error = true;
    System.out.println(
        "Semantic error - The definition of function " + tokenTemporal + " expect "
            + parametros.size() + " parameter/s");
  }

  @Override
  public void exitDefincionFuncion_parametros_global_rule(idParser.DefincionFuncion_parametros_global_ruleContext ctx) {
    List<MiId> parametros = declaracionFuncionesStorage.get(tokenTemporal);
    if (parametros == null)
      return;
    for (MiId parametro : parametros) {
      if (!parametro.getInicializada()) {
        System.out.println(
            "Semantic error - The definition of function " + tokenTemporal + " expect "
                + parametros.size() + " parameter/s");
        error = true;
        return;
      }
    }

    for (MiId parametro : parametros) {
      TablaSimbolos.getInstance().addId(parametro);
    }

  }

  /* ---------------------------- ASIGNACIONES --------------------------- */

  @Override
  public void enterAsignacion(idParser.AsignacionContext ctx) {
    String varibleAsignacion = ctx.getStart().getText();
    if (!isValidVariableName(varibleAsignacion))
      return;
    MiId variableAsignacionId = TablaSimbolos.getInstance().searchId(varibleAsignacion);
    if (variableAsignacionId == null) {
      System.out.println("Semantic error - variable " + varibleAsignacion + " is not declared");
      error = true;
      return;
    }
    tokenTemporal = varibleAsignacion;
    variableAsignacionId.setUsada(true);
    variableAsignacionId.setInicializada(true);
  }

  /* ---------------------------- LLAMADAS / USOS --------------------------- */

  // FUNCIONES

  @Override
  public void enterLlamadaFuncion(idParser.LlamadaFuncionContext ctx) {
    String nombreFuncion = ctx.getStart().getText();
    tokenTemporal = nombreFuncion;
    List<MiId> id = declaracionFuncionesStorage.get(nombreFuncion);
    if (id == null) {
      System.out.println("Semantic error - Funcion " + nombreFuncion + " is not declared");
      error = true;
      return;
    }
    MiId funcionLlamada = TablaSimbolos.getInstance().getContextByIndex(0).get(nombreFuncion);
    funcionLlamada.setUsada(true);

  }

  @Override
  public void enterParametrosConcatenados(idParser.ParametrosConcatenadosContext ctx) {
    aux_parameterCount++;
  }

  @Override
  public void exitParametrosLlamadaFuncion(idParser.ParametrosLlamadaFuncionContext ctx) {
    // tokenTemporal seteado en enterLlamadaFuncion
    int cantidadParametrosEsperados = declaracionFuncionesStorage.get(tokenTemporal).size();
    if (aux_parameterCount == cantidadParametrosEsperados)
      return;
    error = true;
    System.out.println("Semantic error - Funcion " + tokenTemporal + " receive " + aux_parameterCount + " and expects "
        + cantidadParametrosEsperados + " parameters");
    return;
  }

  // OPERACION ARITMETICA LOGICAS
  @Override
  public void enterOperacionaritlogicas_variable(idParser.Operacionaritlogicas_variableContext ctx) {
    String token = ctx.getStart().getText();
    if (isVariable(token)) {
      MiId id = TablaSimbolos.getInstance().searchId(token);
      if (id == null) {
        System.out.println("Semantic error - Variable " + token + " is not declared");
        error = true;
        return;
      }
      id.setUsada(true);
      listaTipoDatos.add(id.getTipoDato());
      return;
    }
    if (isInt(token)) {
      listaTipoDatos.add(TipoDato.INT);

      return;
    }
    if (isFloat(token)) {
      listaTipoDatos.add(TipoDato.FLOAT);
      return;
    }
  }

  @Override
  public void exitOperacionaritlogicas_comparacion(idParser.Operacionaritlogicas_comparacionContext ctx) {
    int iteracion = 1;
    TipoDato tipoDatoPrev = TipoDato.UNDEFINED;
    for (TipoDato tipoDato : listaTipoDatos) {
      if (iteracion % 2 != 0) {
        tipoDatoPrev = tipoDato;
      }
      if (iteracion % 2 == 0 && tipoDatoPrev != tipoDato) {
        System.out.println("Semantic error - You are trying to compare " + tipoDatoPrev + " with " + tipoDato);
        error = true;
        listaTipoDatos.clear();
        return;
      }
      iteracion++;
    }
  }

  /* ---------------------------- FOR --------------------------- */

  @Override
  public void enterIfor(idParser.IforContext ctx) {
    TablaSimbolos.getInstance().addContext();
    contextCount++;
    addContextFlag = false;
  }

  @Override
  public void enterIfor_iteracion(idParser.Ifor_iteracionContext ctx) {
    String token = ctx.getStart().getText();
    if (isValidVariableName(token)) {
      MiId id = TablaSimbolos.getInstance().searchId(token);
      if (id == null) {
        System.out.println("Semantic error - Variable " + token + " is not declared");
        error = true;
        return;
      }
    }
  }

  @Override
  public void exitS(idParser.SContext ctx) {
    if (error)
      return;
    TablaSimbolos.getInstance().displayLastContextContent(0);
    TablaSimbolos.getInstance().removeLastContext();

    // TablaSimbolos.getInstance().getTabla();
    // for (Map.Entry<String, List<MiId>> entry :
    // declaracionFuncionesStorage.entrySet()) {
    // String key = entry.getKey();
    // List<MiId> miIdList = entry.getValue();
    //
    // System.out.println("Key: " + key);
    // for (MiId miId : miIdList) {
    // TipoDato nombre = miId.getTipoDato();
    // System.out.println("Nombre: " + nombre);
    // }
    // }
  }

  // RULES

  public boolean isValidVariableName(String variableName) {
    boolean isValid = isVariable(variableName);
    if (!isValid) {
      System.out.println("Semantic error - Variable " + variableName + " has to contain one letter at least.");
      error = true;
    }
    return isValid;
  }

  @Override
  public void enterPermutacion_variables(idParser.Permutacion_variablesContext ctx) {
    String token = ctx.getStart().getText();
    if (isVariable(token)) {
      MiId id = TablaSimbolos.getInstance().searchId(token);
      if (id == null) {
        System.out.println("Semantic error - Variable " + token + " is not declared");
        error = true;
        return;
      }
      id.setUsada(true);
      aux_id.setTipoDato(id.getTipoDato());
      return;
    }
    if (isInt(token)) {
      aux_id.setTipoDato(TipoDato.INT);
      return;
    }

    if (isFloat(token)) {
      aux_id.setTipoDato(TipoDato.FLOAT);
      return;
    }
  }

  @Override
  public void exitPermutacion_variable_validar_tipo(idParser.Permutacion_variable_validar_tipoContext ctx) {
    MiId token = TablaSimbolos.getInstance().searchId(tokenTemporal);
    if (token.getTipoDato() != aux_id.getTipoDato() && aux_id.getTipoDato() != TipoDato.UNDEFINED) {
      System.out.println("Semantic error - Wrong type, expect " + token.getTipoDato() + " type.");
      error = true;
    }

  }

  // UTILS

  public TipoDato getTipoDatoByToken(String token) {
    if (token.equals("int"))
      return TipoDato.INT;
    if (token.equals("float"))
      return TipoDato.FLOAT;
    if (token.equals("double"))
      return TipoDato.DOUBLE;
    return TipoDato.UNDEFINED;
  }

  public boolean isFloat(String str) {
    try {
      Float.parseFloat(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public boolean isInt(String str) {
    try {
      Integer.parseInt(str);
      return true;
    } catch (NumberFormatException er) {
      return false;
    }
  }

  public boolean isVariable(String str) {
    Pattern pattern = Pattern.compile("[a-zA-Z]");
    Matcher matcher = pattern.matcher(str);
    boolean isValid = matcher.find();
    return isValid;
  }

}
