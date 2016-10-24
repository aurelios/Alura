package br.com.alura.observer;

import br.com.alura.builder.exercicio.NotaFiscal;

public class ImpressoraDeNotaFiscal implements AcaoAposNotaFiscal {

	public void executa(NotaFiscal nf) {
		System.out.println("Nota Fiscal impressa");
	}
	
}
