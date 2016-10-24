package br.com.alura.observer;

import br.com.alura.builder.exercicio.NotaFiscal;

public class TestaConstrucaoDaNotaFiscalEExecucaoDasAcoes {

	public static void main(String[] args) {
		NotaFiscal notaFiscal = new NotaFiscalBuilder()
			.adicionaAcao(new EnviadorDeEmail())
			.adicionaAcao(new NotaFiscalDao())
			.adicionaAcao(new ImpressoraDeNotaFiscal())
			.comCnpj("1234567")
			.constroi();

		System.out.println("Nota Fiscal criada: " + notaFiscal);
	}

}
