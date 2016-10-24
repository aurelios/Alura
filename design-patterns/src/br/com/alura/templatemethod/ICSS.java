package br.com.alura.templatemethod;

import br.com.alura.chainofresponsability.Orcamento;

public class ICSS extends TemplateImpostoCondicional {

	@Override
	public boolean taxacaoForMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 200;
	}

	@Override
	public double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.09;
	}

	@Override
	public double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.04;
	}


}
