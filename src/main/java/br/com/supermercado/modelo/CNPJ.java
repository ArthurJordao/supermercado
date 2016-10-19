package br.com.supermercado.modelo;

public class CNPJ implements Documento {

  private final TipoDocumento tipo = TipoDocumento.CNPJ;
  private final String numeroDoDocumento;
  private final String titular;
  
  public CNPJ(String titular, String numeroDoDocumento) {
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
