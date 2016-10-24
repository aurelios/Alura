package br.com.alura.decorator.exercicio;

import br.com.alura.chainofresponsability.Orcamento;

public class CalculadoraDeImpostos {

	public double calculaImposto(Orcamento orcamento, Imposto imposto) {
		return imposto.calculaImposto(orcamento);
	}
}
