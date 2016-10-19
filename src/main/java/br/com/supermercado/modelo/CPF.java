package br.com.supermercado.modelo;

public class CPF implements Documento {
  
  private final TipoDocumento tipo = TipoDocumento.CPF;
  private final String titular;
  private final String numeroDoDocumento;

  public CPF(String titular, String numeroDoDocumento) {
    this.titular = titular;
    this.numeroDoDocumento = numeroDoDocumento;
  }

  @Override
  public TipoDocumento getTipo() {
    return tipo;
  }

  @Override
  public String getNumeroDoDocumento() {
    return numeroDoDocumento;
  }

  @Override
  public String getTitular() {
    return titular;
  }

}
