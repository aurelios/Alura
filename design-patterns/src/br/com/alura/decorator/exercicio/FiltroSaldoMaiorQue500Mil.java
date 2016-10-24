package br.com.alura.decorator.exercicio;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMaiorQue500Mil extends Filtro {

	public FiltroSaldoMaiorQue500Mil() {
	}
	
	public FiltroSaldoMaiorQue500Mil(Filtro proximoFiltro) {
		super(proximoFiltro);
	}
	
	@Override
	protected List<Conta> filtra(List<Conta> contas) {
		List<Conta> fraudulentas = new ArrayList<>();
		for (Conta conta : contas) {
			if (conta.getSaldo() > 500000)
				fraudulentas.add(conta);
		}
		fraudulentas.addAll(proximoFiltro(fraudulentas));
		
		return fraudulentas;
	}

}
