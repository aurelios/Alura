package br.com.alura.chainofresponsability;

public class DescontoPorValorMaiorQueMilNoOrcamento implements Desconto {

	private Desconto proximoDesconto;

	public double calculaDesconto(Orcamento orcamento) {
		if (orcamento.getValor() > 1000) {
			return orcamento.getValor() * 0.10;
		}
		return proximoDesconto.calculaDesconto(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

}
