package br.com.alura.chainofresponsability;

public class SemDesconto implements Desconto {

	@Override
	public double calculaDesconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		//nao possui proximo desconto pois esta no final da cadeia
	}

}
