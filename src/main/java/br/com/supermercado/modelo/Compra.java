package br.com.supermercado.modelo;


public class Compra {
  
  private final Documento documento;
  private final double valor;
  
  public Compra(double valor, Documento documento) {
    this.valor = valor;
    this.documento = documento;
  }

  public double calculaDesconto(){
    CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
    double desconto = calculadora.calcula(this);
    return desconto;
  }

  public double getValor() {
    return valor;
  }

  public Documento getDocumento() {
    return documento;
  }
  
}
