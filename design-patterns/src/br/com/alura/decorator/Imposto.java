package br.com.alura.decorator;

import br.com.alura.chainofresponsability.Orcamento;

public abstract class Imposto {

	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {
	}
	
	abstract double calculaImposto(Orcamento orcamento);

	protected double calculaOProximoImposto(Orcamento orcamento) {
		return outroImposto.calculaImposto(orcamento); //decoramos o nosso imposto com o proximo imposto
	}
	
}
