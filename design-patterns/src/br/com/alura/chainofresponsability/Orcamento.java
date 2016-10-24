package br.com.alura.chainofresponsability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;

	private List<Item> itens = new ArrayList<>();
	
	public Orcamento(double valor) {
		this.valor = valor;
	}
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public double getValor() {
		return valor;
	}

	public int quantidadeDeItens() {
		return this.itens.size();
	}

}
