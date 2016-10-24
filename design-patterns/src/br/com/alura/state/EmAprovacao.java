package br.com.alura.state;

public class EmAprovacao implements EstadoDeUmOrcamento {

	@Override
	public double aplicaDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor() * 0.80;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Reprovado());
	}

	@Override
	public void emAprovacao(Orcamento orcamento) {
		throw new RuntimeException("Ja esta em Aprovacao");
	}
	
}
