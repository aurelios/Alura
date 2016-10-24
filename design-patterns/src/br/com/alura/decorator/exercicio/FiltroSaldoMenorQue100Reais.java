package br.com.alura.decorator.exercicio;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMenorQue100Reais extends Filtro {

	public FiltroSaldoMenorQue100Reais(Filtro proximoFiltro) {
		super(proximoFiltro);
	}
	
	@Override
	protected List<Conta> filtra(List<Conta> contas) {
		List<Conta> fraudulentas = new ArrayList<>();
		for (Conta conta : contas) {
			if (conta.getSaldo() < 100) {
				fraudulentas.add(conta);
			}
		}
		fraudulentas.addAll(proximoFiltro(fraudulentas));
		
		return fraudulentas;
	}

}
