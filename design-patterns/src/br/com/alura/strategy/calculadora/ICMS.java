package br.com.alura.strategy.calculadora;

public class ICMS implements Imposto {

	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}
	
}
