package br.com.alura.templatemethod;

import br.com.alura.chainofresponsability.Orcamento;

public abstract class TemplateImpostoCondicional implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		if(taxacaoForMaxima(orcamento))
			return taxacaoMaxima(orcamento);
		else
			return taxacaoMinima(orcamento);
	}

	public abstract boolean taxacaoForMaxima(Orcamento orcamento);
	
	public abstract double taxacaoMaxima(Orcamento orcamento);
	
	public abstract double taxacaoMinima(Orcamento orcamento);

}
