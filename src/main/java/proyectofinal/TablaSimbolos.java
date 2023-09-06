package proyectofinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class TablaSimbolos {
  private static TablaSimbolos tabla_instance = null;

  private List<HashMap<String, MiId>> contextosLogicos;

  private TablaSimbolos() {
    this.contextosLogicos = new ArrayList<HashMap<String, MiId>>();
    this.addContext();
  }

  public void addContext() {
    contextosLogicos.add(new HashMap<String, MiId>());
  }

  public void addId(MiId id) {
    if (!isThisTokenAlreadyDeclared(id.getToken()))
      contextosLogicos.get(contextosLogicos.size() - 1).put(id.getToken(), id);
  }

  public boolean isThisTokenAlreadyDeclared(String token) {
    boolean alreadyExist = false;
    if (contextosLogicos.get(contextosLogicos.size() - 1).containsKey(token)) {
      System.out.println(
          "Semantic error - the token: '" + token + "' already declared in this context (redeclaration error!)");
      alreadyExist = true;
    }
    return alreadyExist;
  }

  public void getTabla() {
    for (int i = 0; i < contextosLogicos.size(); i++) {
      List<MiId> idLista = new ArrayList<MiId>(contextosLogicos.get(i).values());
      System.out.println("CONTEXTO " + i);
      for (int j = 0; j < idLista.size(); j++) {
        System.out.println(" TOKEN:" + idLista.get(j).getToken() + " - Inicializada: "
            + idLista.get(j).getInicializada() + " - Tipo: " + idLista.get(j).getTipoDato() + " - Usada: "
            + idLista.get(j).getUsada() + " - Funcion: " + idLista.get(j).getFuncion());
      }
    }
  }

  public void displayLastContextContent(Integer contextIndex) {
    List<MiId> context = new ArrayList<MiId>(getLastContext().values());
    System.out.println("");
    System.out.println("CONTEXTO");
    for (int j = 0; j < context.size(); j++) {
      System.out.println(" TOKEN:" + context.get(j).getToken() + " - Inicializada: "
          + context.get(j).getInicializada() + " - Tipo: " + context.get(j).getTipoDato() + " - Usada: "
          + context.get(j).getUsada() + " - Funcion: " + context.get(j).getFuncion());
    }
  }

  public void removeLastContext() {
    if (contextosLogicos.size() > 0) {
      contextosLogicos.remove(getContextosLogicosSize() - 1);
    }
  }

  public HashMap<String, MiId> getContextByIndex(int index) {
    return contextosLogicos.get(index);
  }

  public HashMap<String, MiId> getLastContext() {
    return contextosLogicos.get(contextosLogicos.size() - 1);
  }

  public boolean findTokenByContextIndex(String token, int index) {
    return getContextByIndex(index).containsKey(token);
  }

  public Integer getContextosLogicosSize() {
    return contextosLogicos.size();
  }

  public MiId searchId(String idForSearch) {
    for (int i = getContextosLogicosSize() - 1; i >= 0; i--) {
      MiId id = getContextByIndex(i).get(idForSearch);
      if (id != null)
        return id;
    }
    return null;
  }

  public static TablaSimbolos getInstance() {
    if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

    return tabla_instance;
  }
}
