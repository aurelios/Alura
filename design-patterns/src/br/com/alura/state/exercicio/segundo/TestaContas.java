package br.com.alura.state.exercicio.segundo;

public class TestaContas {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		
		System.out.println(conta.getSaldo());
	} 
	
}
