package br.com.alura.templatemethod;

import br.com.alura.chainofresponsability.Item;
import br.com.alura.chainofresponsability.Orcamento;

public class ICPP extends TemplateImpostoCondicional {
	
	@Override
	public boolean taxacaoForMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500 && existeItemMaiorQueCemReaisNo(orcamento);
	}
	
	@Override
	public double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	private boolean existeItemMaiorQueCemReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}
		return false;
	}
	
}
