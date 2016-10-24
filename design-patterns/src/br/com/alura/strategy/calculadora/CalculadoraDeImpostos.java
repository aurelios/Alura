package br.com.alura.strategy.calculadora;

public class CalculadoraDeImpostos {

	//Podemos receber varias estrategias de calculo de impostos
	public double calculaImposto(Orcamento orcamento, Imposto imposto) {
		return imposto.calculaImposto(orcamento);
	}

}
