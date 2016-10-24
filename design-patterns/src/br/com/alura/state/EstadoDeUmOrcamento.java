package br.com.alura.state;

public interface EstadoDeUmOrcamento {

	double aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	
	void reprova(Orcamento orcamento);
	
	void emAprovacao(Orcamento orcamento);
}
