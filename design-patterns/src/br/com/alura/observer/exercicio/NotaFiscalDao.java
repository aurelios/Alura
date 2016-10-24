package br.com.alura.observer.exercicio;

import br.com.alura.builder.exercicio.NotaFiscal;

public class NotaFiscalDao implements AcaoParaSeremExecutadas {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota Fiscal salva no banco");
	}

}
