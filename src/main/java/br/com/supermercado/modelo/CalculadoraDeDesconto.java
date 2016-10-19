package br.com.supermercado.modelo;

public class CalculadoraDeDesconto {

  public double calcula(Compra compra) {
    Desconto correnteDeDesconto = new DescontoParaPessoaFisica(new DescontoParaPessoaJuridica(new SemDesconto()));
    double desconto = correnteDeDesconto.desconto(compra);
    
    
    return desconto;
  }

}
