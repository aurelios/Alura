package br.com.alura.state;

public class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public double aplicaDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor() * 0.90;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Ja foi aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Reprovado());
	}

	@Override
	public void emAprovacao(Orcamento orcamento) {
		orcamento.setEstadoAtual(new EmAprovacao());
	}
}
