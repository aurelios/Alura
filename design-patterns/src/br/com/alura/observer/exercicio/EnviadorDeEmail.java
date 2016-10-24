package br.com.alura.observer.exercicio;

import br.com.alura.builder.exercicio.NotaFiscal;

public class EnviadorDeEmail implements AcaoParaSeremExecutadas {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Email enviado");
	}

}
