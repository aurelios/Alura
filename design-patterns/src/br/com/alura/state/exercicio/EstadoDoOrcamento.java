package br.com.alura.state.exercicio;

public interface EstadoDoOrcamento {

	public Double calculaDescontoExtra(Orcamento orcamento);

	public void aprova(Orcamento orcamento);
	
	public void reprova(Orcamento orcamento);
	
	public void finaliza(Orcamento orcamento);
	
}
