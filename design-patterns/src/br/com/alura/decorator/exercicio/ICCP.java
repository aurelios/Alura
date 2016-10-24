package br.com.alura.decorator.exercicio;

import br.com.alura.chainofresponsability.Orcamento;

public class ICCP extends Imposto {

	public ICCP(Imposto proximoImposto) {
		super(proximoImposto);
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 + calculaProximoImposto(orcamento);
	}


}
