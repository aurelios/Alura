package br.com.alura.strategy.investimento;

public class TestaRealizacaoDeInvestimento {

	public static void main(String[] args) {
		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();
		
		Conta conta = new Conta(100);
		
		realizador.calculaInvestimento(conta, new InvestimentoConservador());
		
		System.out.println(conta.getSaldo());
	}
	
}
