package br.com.alura.state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public double aplicaDescontoExtra(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado precisa ser reaberto para ser aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Ja reprovado");
	}

	@Override
	public void emAprovacao(Orcamento orcamento) {
		throw new RuntimeException("Ja foi reprovado");
	}

}
