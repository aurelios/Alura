package br.com.alura.chainofresponsability;

public interface Desconto {

	double calculaDesconto(Orcamento orcamento);
	
	void setProximoDesconto(Desconto proximoDesconto);

}
