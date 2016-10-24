package br.com.alura.state.exercicio;

public class Orcamento {

	private Double valor;
	
	private EstadoDoOrcamento estadoAtual = new EmAprovacao();
	
	public Orcamento(Double valor) {
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}

	public void setEstadoAtual(EstadoDoOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	
	public EstadoDoOrcamento getEstadoAtual() {
		return estadoAtual;
	}
	
	public void aplicaDescontoExtra() {
		this.valor = estadoAtual.calculaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}
	
}
