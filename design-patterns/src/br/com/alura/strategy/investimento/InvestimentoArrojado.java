package br.com.alura.strategy.investimento;

import java.util.Random;

public class InvestimentoArrojado implements Investimento {

	public double calculaInvestimento(Conta conta) {
		double porcentagem = new Random().nextInt(10);
		
		if (porcentagem >= 0 && porcentagem <= 1)
			return conta.getSaldo() * 0.5;
		if (porcentagem >= 2 && porcentagem <= 4)
			return conta.getSaldo() * 0.3;
		else
			return conta.getSaldo() * 0.006;
	}
	
}
