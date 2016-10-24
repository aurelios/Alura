package br.com.alura.state.exercicio;

public class Reprovado implements EstadoDoOrcamento {

	@Override
	public Double calculaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Sem desconto extra para orcamento Reprovado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Ja foi reprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Ja foi reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Ja foi reprovado");
	}
}
