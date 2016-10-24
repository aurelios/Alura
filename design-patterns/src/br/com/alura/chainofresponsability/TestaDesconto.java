package br.com.alura.chainofresponsability;

public class TestaDesconto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(600);
		orcamento.adicionaItem(new Item("Cabo de rede", 300));
		orcamento.adicionaItem(new Item("Mouse", 250));
		orcamento.adicionaItem(new Item("Mouse Wifi", 350));
		orcamento.adicionaItem(new Item("Notebook", 1350));
		orcamento.adicionaItem(new Item("Capa de teclado", 100));
		
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		
		double descontoDado = calculadora.calculaDesconto(orcamento);
		
		System.out.println(descontoDado);
	}
	
}
