package br.com.alura.decorator;

import br.com.alura.chainofresponsability.Orcamento;

public class TestaCalculoDeImpostoComposto {

	public static void main(String[] args) {
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		Imposto icpp = new ICPP(new IKCV());
		double valorCalculado = calculadora.calculaImposto(new Orcamento(500), icpp);
		
		System.out.println(valorCalculado);
	}
}
