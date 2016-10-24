package br.com.alura.templatemethod.exercicio;

import br.com.alura.chainofresponsability.Orcamento;
import br.com.alura.templatemethod.Imposto;

public abstract class TemplateDeImpostoCondicional implements Imposto {

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
