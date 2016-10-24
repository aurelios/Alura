package br.com.alura.state.formachula;

public class Orcamento {

	private double valor;
	
	private int estadoAtual;
	
	private static final int REPROVADO = 0;
	
	private static final int EM_APROVACAO = 2;
	
	private static final int APROVADO = 1;

	private static final int ANALISADO = 3;

	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = EM_APROVACAO;
	}

	public double getValor() {
		return valor;
	}

	public void aplicaDescontoExtra() {
		if(estadoAtual == APROVADO) {
			this.valor = this.valor * 0.90;
		}
		else if(estadoAtual == EM_APROVACAO) {
			this.valor = this.valor * 0.80;
		}
		else if (estadoAtual == ANALISADO) {
			this.valor = this.valor * 0.70;
		}
		else if(estadoAtual == REPROVADO) {
			throw new RuntimeException("Reprovado nao pode ter desconto");
		}
	}
	
}
