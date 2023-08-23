package proyectofinal;

import java.util.*;
import org.antlr.v4.runtime.tree.ErrorNode;

public class MiListener extends idBaseListener {
  private Boolean error;

  MiListener(idParser parser) {

  }

  public Boolean getError() {
    return error;
  }

  @Override
  public void enterBloque(idParser.BloqueContext ctx) {
    TablaSimbolos.getInstance().addContext();
  }

  @Override
  public void enterDeclarar(idParser.DeclararContext ctx) {
    MiId id = new MiId();
    String token = ctx.getStart().getText();
    id.setToken(token);
    TablaSimbolos.getInstance().addId(id);
  }

}
