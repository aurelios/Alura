package br.com.alura.templatemethod.exercicio;

import br.com.alura.chainofresponsability.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	public boolean taxacaoForMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

}
