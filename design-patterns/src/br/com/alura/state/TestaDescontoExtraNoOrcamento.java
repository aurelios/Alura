package br.com.alura.state;

public class TestaDescontoExtraNoOrcamento {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(100);
		
		reforma.aprova();
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}
	
}
