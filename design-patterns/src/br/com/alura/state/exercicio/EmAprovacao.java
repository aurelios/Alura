package br.com.alura.state.exercicio;

public class EmAprovacao implements EstadoDoOrcamento {

	private boolean descontoJaAplicado;

	@Override
	public Double calculaDescontoExtra(Orcamento orcamento) {
		descontoJaAplicado = true;
		if (descontoJaAplicado) {
			throw new RuntimeException("O desconto ja foi aplicado");
		}
		return orcamento.getValor() * 0.95;
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
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Nao pode finalizar um orcamento em aprovacao");
	}
	
}
