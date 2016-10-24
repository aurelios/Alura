package br.com.alura.observer.exercicio;

public class TestaExecutacaoDasAcoes {

	public static void main(String[] args) {
		new NotaFiscalBuilder()
			.adiciona(new EnviadorDeEmail())
			.adiciona(new NotaFiscalDao())
			.adiciona(new Multiplicador(10))
			.comCnpj("12345")
			.constroi();
	}
	
}
