package br.com.alura.chainofresponsability;

public class DescontoPorMaisDeCincoItens implements Desconto {

	private Desconto proximoDesconto;

	public double calculaDesconto(Orcamento orcamento) {
		if(orcamento.quantidadeDeItens() >= 5) { //segunda regra do desconto levando em consideracao a quant de itens
			return orcamento.getValor() * 0.7;
		}
		return proximoDesconto.calculaDesconto(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
}
