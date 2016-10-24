package br.com.alura.state.exercicio;

public class Finalizado implements EstadoDoOrcamento {

	@Override
	public Double calculaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Sem desconto extra para orcamento Reprovado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("ja foi finalizado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("ja foi finalizado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("ja foi finalizado");
	}
	
}
