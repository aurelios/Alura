package br.com.alura.state.exercicio.segundo;

public class EstadoPositivo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		if(conta.getSaldo() < 0) {
			throw new RuntimeException("Conta ja esta negativa e voce nao pode sacar");
		}
		conta.saldo -= valor;
		
		if (conta.getSaldo() < 0) {
			conta.estadoAtual = new EstadoNegativo();
		}
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}
	
}
