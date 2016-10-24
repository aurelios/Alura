package br.com.alura.decorator;

import br.com.alura.chainofresponsability.Orcamento;
import br.com.alura.decorator.Imposto;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	@Override
	public final double calculaImposto(Orcamento orcamento) {
		if(taxacaoForMaxima(orcamento))
			return maximaTaxacao(orcamento);
		else
			return minimaTaxacao(orcamento);
	}

	public abstract boolean taxacaoForMaxima(Orcamento orcamento);
	
	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);
}
