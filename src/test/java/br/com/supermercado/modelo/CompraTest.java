package br.com.supermercado.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompraTest {

  @Test
  public void testDescontoCpf() {
    Documento cpfArthur = new CPF("Arthur", "41528125835");
    Compra compra = new Compra(1000.00, cpfArthur);
    double desconto = compra.calculaDesconto();
    assertEquals(50.0, desconto, 0.00001);
  }
  
  @Test
  public void testaDescontoCnpj() {
    Documento cnpjEmpresaWhatever = new CNPJ("Whatever", "96343385000169");
    Compra compra = new Compra(1000.0, cnpjEmpresaWhatever);
    
    double desconto = compra.calculaDesconto();
    assertEquals(100.0, desconto, 0.00001);
  }
  
  @Test
  public void testaDescontoCnpjValoresMaioresQue500() {
    Documento cnpjEmpresaWhatever = new CNPJ("Whatever", "96343385000169");
    Compra compra = new Compra(1500.0, cnpjEmpresaWhatever);
    
    double desconto = compra.calculaDesconto();
    assertEquals(300.0, desconto, 0.00001);
  }

}
