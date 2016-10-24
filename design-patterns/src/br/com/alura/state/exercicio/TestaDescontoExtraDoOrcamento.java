package br.com.alura.state.exercicio;

public class TestaDescontoExtraDoOrcamento {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(100.0);
		
		orcamento.aplicaDescontoExtra();
		
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		
		System.out.println(orcamento.getValor());
	}
	
}
