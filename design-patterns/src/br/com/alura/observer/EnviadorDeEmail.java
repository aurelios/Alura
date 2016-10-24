package br.com.alura.observer;

import br.com.alura.builder.exercicio.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposNotaFiscal {

	public void executa(NotaFiscal nf) {
		System.out.println("Email enviado");
	}
}
