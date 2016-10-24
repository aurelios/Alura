package br.com.alura.strategy.investimento;

import java.util.Random;

public class InvestimentoModerado implements Investimento {

	public double calculaInvestimento(Conta conta) {
		if (new Random().nextInt(2) == 0) {
			return conta.getSaldo() * 0.025;
		}
		else {
			return conta.getSaldo() * 0.007;
		}
	}
}
