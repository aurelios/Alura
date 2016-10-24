package br.com.alura.templatemethod.exercicio;

import br.com.alura.chainofresponsability.Orcamento;
import br.com.alura.templatemethod.Imposto;

public class CalculadoraDeImpostos {

	public double calculaImposto(Orcamento orcamento, Imposto imposto) {
		return imposto.calculaImposto(orcamento);
	}
}
