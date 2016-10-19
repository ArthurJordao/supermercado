package br.com.supermercado.modelo;


public class DescontoParaPessoaFisica implements Desconto {

  private final Desconto proximo;

  public DescontoParaPessoaFisica(Desconto proximo) {
    this.proximo = proximo;
  }

  @Override
  public double desconto(Compra compra) {

    if (compra.getDocumento().getTipo() == TipoDocumento.CPF) {
      return compra.getValor() * 0.05;
    }
    return proximo.desconto(compra);
  }



}
