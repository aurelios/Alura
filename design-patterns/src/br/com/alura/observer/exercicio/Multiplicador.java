package br.com.alura.observer.exercicio;

import br.com.alura.builder.exercicio.NotaFiscal;

public class Multiplicador implements AcaoParaSeremExecutadas {

	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Valor impresso: " + nf.getValorBruto() * fator);
	}

}
