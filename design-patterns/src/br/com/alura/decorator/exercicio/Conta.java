package br.com.alura.decorator.exercicio;

public class Conta {

	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
	
}
