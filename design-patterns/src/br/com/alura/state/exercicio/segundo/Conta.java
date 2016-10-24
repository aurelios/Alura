package br.com.alura.state.exercicio.segundo;

public class Conta {

	protected double saldo;
	
	protected EstadoDaConta estadoAtual;
	
	public Conta() {
		this.estadoAtual = new EstadoPositivo();
	}
	
	public void deposita(double valor) {
		this.estadoAtual.deposita(this, valor);
	}
	
	public void saca(double valor) {
		this.estadoAtual.saca(this, valor);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
