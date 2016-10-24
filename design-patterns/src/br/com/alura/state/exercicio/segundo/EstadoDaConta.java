package br.com.alura.state.exercicio.segundo;

public interface EstadoDaConta {

	public void saca(Conta conta, double valor);

	public void deposita(Conta conta, double valor);
	
}
