package br.com.alura.decorator;

import br.com.alura.chainofresponsability.Orcamento;

public class IKCV extends Imposto {

	public IKCV() {
	}
	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaOProximoImposto(orcamento);
	}

}
