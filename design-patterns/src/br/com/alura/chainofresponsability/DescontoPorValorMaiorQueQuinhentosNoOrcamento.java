package br.com.alura.chainofresponsability;

public class DescontoPorValorMaiorQueQuinhentosNoOrcamento implements Desconto {

	private Desconto proximoDesconto;

	public double calculaDesconto(Orcamento orcamento) {
		if (orcamento.getValor() > 500) { //primeira regra de desconto levando em consideracao o valor
			return orcamento.getValor() * 0.05;
		}
		return proximoDesconto.calculaDesconto(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
	
}
