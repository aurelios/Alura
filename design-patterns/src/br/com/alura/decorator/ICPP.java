package br.com.alura.decorator;

import br.com.alura.chainofresponsability.Orcamento;

public class ICPP extends Imposto {

	public ICPP() {
	}
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 + calculaOProximoImposto(orcamento);
	}

}
