package br.com.alura.state.exercicio.segundo;

public class EstadoNegativo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("A sua conta esta negativa");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		if (conta.getSaldo() > 0) {
			conta.estadoAtual = new EstadoPositivo();
		}
	}

}
