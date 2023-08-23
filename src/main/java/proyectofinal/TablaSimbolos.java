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

  public static TablaSimbolos getInstance() {
    if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

    return tabla_instance;
  }
}
