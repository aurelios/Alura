package br.com.alura.state.exercicio;

public class Aprovado implements EstadoDoOrcamento {

	@Override
	public Double calculaDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor() * 0.98;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Ja foi aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento aprovado nao pode ser reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		
	}
	
}
