package br.com.alura.decorator.exercicio;

import br.com.alura.chainofresponsability.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto proximoImposto) {
		super(proximoImposto);
	}

	public ImpostoMuitoAlto() {
	}

	@Override
	double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 1.20 + calculaProximoImposto(orcamento);
	}
	
}
