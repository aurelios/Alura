package br.com.alura.strategy.investimento;

public class RealizadorDeInvestimentos {

	public void calculaInvestimento(Conta conta, Investimento investimento) {
		double valorCalculado = investimento.calculaInvestimento(conta);
		conta.deposita(valorCalculado * 0.75);
	}
}
