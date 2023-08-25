package proyectofinal;

import java.util.*;
import org.antlr.v4.runtime.tree.ErrorNode;

public class MiListener extends idBaseListener {
  private Boolean error;
  private TipoDato tipoDatoActual;

  MiListener(idParser parser) {
  }

  public Boolean getError() {
    return error;
  }

  @Override
  public void enterBloque(idParser.BloqueContext ctx) {
    TablaSimbolos.getInstance().addContext();
  }

  /* ---------------------------- DECLARACIONES --------------------------- */

  // Variables
  @Override
  public void enterTypes(idParser.TypesContext ctx) {
    String token = ctx.getStart().getText();
    tipoDatoActual = getTipoDatoByToken(token);
  }

  @Override
  public void enterDeclararAsignacion(idParser.DeclararAsignacionContext ctx) {
    String token = ctx.getStart().getText();
    MiId id = new MiId(token, true, this.tipoDatoActual, false, false);
    TablaSimbolos.getInstance().addId(id);
  }

  @Override
  public void enterDeclararSinAsignacion(idParser.DeclararSinAsignacionContext ctx) {
    String token = ctx.getStart().getText();
    MiId id = new MiId(token, false, this.tipoDatoActual, false, false);
    TablaSimbolos.getInstance().addId(id);
  }

  // Funciones
  @Override
  public void enterTypesFunciones(idParser.TypesFuncionesContext ctx) {
    tipoDatoActual = getTipoDatoByToken(ctx.getStart().getText());
  }

  @Override
  public void enterDeclaracionFuncion_Nombre(idParser.DeclaracionFuncion_NombreContext ctx) {
    String token = ctx.getStart().getText();
    MiId id = new MiId(token, false, this.tipoDatoActual, false, true);
    TablaSimbolos.getInstance().addId(id);
  }

  // TODO: INICIALIZAR FUNCIONES
  // otra cosa
  @Override
  public void enterNombreParametroFuncion(idParser.NombreParametroFuncionContext ctx) {
    MiId id = new MiId();
    id.setToken(ctx.getStart().getText());
    TablaSimbolos.getInstance().addId(id);
  }

  @Override
  public void enterDefincionFuncion(idParser.DefincionFuncionContext ctx) {
    TablaSimbolos.getInstance().addContext();
  }

  @Override
  public void exitS(idParser.SContext ctx) {
    TablaSimbolos.getInstance().getTabla();
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

}
