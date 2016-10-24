package br.com.alura.templatemethod.exercicio;

import java.util.ArrayList;

import br.com.alura.chainofresponsability.Item;
import br.com.alura.chainofresponsability.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public boolean taxacaoForMaxima(Orcamento orcamento) {
		return existemDoisItensComOMesmoNomeNo(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.quantidadeDeItens();
	}

	private boolean existemDoisItensComOMesmoNomeNo(Orcamento orcamento) {
		ArrayList<String> nomesEncontrados = new ArrayList<String>();
		for (Item item : orcamento.getItens()) {
			if (nomesEncontrados.contains(item.getNome())) {
				return true;
			}
			nomesEncontrados.add(item.getNome());
		}
		return false;
	}
}
