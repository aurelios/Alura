package br.com.alura.decorator.exercicio;

import java.util.List;

public class FiltroDeContasFraudulentas {

	private Filtro filtro;

	public FiltroDeContasFraudulentas(Filtro filtro) {
		this.filtro = filtro;
	}

	public List<Conta> filtrarContas(List<Conta> listaDeContas) {
		return filtro.filtra(listaDeContas);
	}

}
