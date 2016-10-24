package br.com.alura.decorator.exercicio;

import br.com.alura.chainofresponsability.Orcamento;

public class TestaImpostoMuitoAlto {

	public static void main(String[] args) {
		Imposto iccp = new ICCP(new ImpostoMuitoAlto());
		
		System.out.println(iccp.calculaImposto(new Orcamento(300)));
	}
}
