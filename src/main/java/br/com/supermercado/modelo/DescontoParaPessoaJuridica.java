package br.com.supermercado.modelo;

public class DescontoParaPessoaJuridica implements Desconto {

  private final Desconto proximo;

  public DescontoParaPessoaJuridica(Desconto proximo) {
    this.proximo = proximo;
  }

  @Override
  public double desconto(Compra compra) {
    if (compra.getDocumento().getTipo() == TipoDocumento.CNPJ) {

      int valorInteiro = (int) compra.getValor();
      int multiplicadorDeDesconto = valorInteiro / 500 - 1;

      double descontoTaxaBase = 0.05;

      for (int x = 0; x < multiplicadorDeDesconto; x++) {
        descontoTaxaBase = descontoTaxaBase * 2;
      }

      double descontoTotal = compra.getValor() * descontoTaxaBase;

      return descontoTotal;
    }
    return proximo.desconto(compra);
  }

}
