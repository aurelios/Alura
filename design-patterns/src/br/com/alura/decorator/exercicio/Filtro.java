package br.com.alura.decorator.exercicio;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	protected Filtro proximoFiltro;

	public Filtro() {
	}
	
	public Filtro(Filtro proximoFiltro) {
		this.proximoFiltro = proximoFiltro;
	}
	
	protected abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> proximoFiltro(List<Conta> contas) {
		if (proximoFiltro != null)
			return proximoFiltro.filtra(contas);
		return new ArrayList<>();
	}
	
}
