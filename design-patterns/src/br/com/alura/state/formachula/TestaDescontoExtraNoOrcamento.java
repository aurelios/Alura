package br.com.alura.state.formachula;

public class TestaDescontoExtraNoOrcamento {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(100);
		
		//queremos aplicar um desconto extra de acordo com o status do orcamento
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}
	
}
