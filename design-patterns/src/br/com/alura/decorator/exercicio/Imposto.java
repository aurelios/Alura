package br.com.alura.decorator.exercicio;

import br.com.alura.chainofresponsability.Orcamento;

public abstract class Imposto {

	protected Imposto proximoImposto;
	
	public Imposto() {
	}
	
	public Imposto(Imposto proximoImposto) {
		this.proximoImposto = proximoImposto;
	}
	
	abstract double calculaImposto(Orcamento orcamento);
	
	protected double calculaProximoImposto(Orcamento orcamento) {
		if (proximoImposto != null)
			return proximoImposto.calculaImposto(orcamento);
		return 0;
	}
	
}
