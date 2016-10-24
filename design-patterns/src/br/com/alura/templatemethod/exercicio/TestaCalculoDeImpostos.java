package br.com.alura.templatemethod.exercicio;

import br.com.alura.chainofresponsability.Orcamento;

public class TestaCalculoDeImpostos {

	public static void main(String[] args) {
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		double impostoICPPCalculado = calculadora.calculaImposto(new Orcamento(300), new ICPP());
		
		System.out.println(impostoICPPCalculado);
		
		Orcamento orcamento = new Orcamento(1000);
		double impostoIKCVCalculado = calculadora.calculaImposto(orcamento, new IKCV());
		
		System.out.println(impostoIKCVCalculado);
	}
	
}
