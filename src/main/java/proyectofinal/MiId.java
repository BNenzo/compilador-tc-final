package proyectofinal;

enum TipoDato {
  VOID,
  INT,
  DOUBLE,
  FLOAT,
  UNDEFINED
}

public class MiId {
  private String Token;

  private Boolean Inicializada;
  private TipoDato tipoDato;
  private Boolean Usada;
  private Boolean funcion;

  public Boolean getFuncion() {
    return this.funcion;
  }

  public void setFuncion(Boolean funcion) {
    this.funcion = funcion;
  };

  public MiId() {
    this.Token = "";
    this.tipoDato = TipoDato.UNDEFINED;
    this.Usada = false;
    this.Inicializada = false;
    this.funcion = false;
  }

  public MiId(String _token, Boolean _inicializada, TipoDato _tipoDato, Boolean _usada, Boolean funcion) {
    this.Token = _token;
    this.tipoDato = _tipoDato;
    this.Usada = _usada;
    this.Inicializada = _inicializada;
    this.funcion = funcion;
  }

  public String getToken() {
    return this.Token;
  }

  public void setToken(String Token) {
    this.Token = Token;
  }

  public Boolean getInicializada() {
    return this.Inicializada;
  }

  public void setInicializada(Boolean Inicializada) {
    this.Inicializada = Inicializada;
  }

  public TipoDato getTipoDato() {
    return this.tipoDato;
  }

  public void setTipoDato(TipoDato tipoDato) {
    this.tipoDato = tipoDato;
  }

  public Boolean getUsada() {
    return this.Usada;
  }

  public void setUsada(Boolean Usada) {
    this.Usada = Usada;
  }

  public void clearId() {
    this.Token = "";
    this.tipoDato = TipoDato.UNDEFINED;
    this.Usada = false;
    this.Inicializada = false;
  }
}
