package br.com.alura.strategy.investimento;

public class InvestimentoConservador implements Investimento {

	public double calculaInvestimento(Conta conta) {
		return conta.getSaldo() * 0.08;
	}
}
