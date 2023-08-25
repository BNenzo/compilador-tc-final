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

  public static TablaSimbolos getInstance() {
    if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

    return tabla_instance;
  }
}
