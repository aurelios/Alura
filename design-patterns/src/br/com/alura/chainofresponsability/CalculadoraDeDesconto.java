package br.com.alura.chainofresponsability;

public class CalculadoraDeDesconto {

	public double calculaDesconto(Orcamento orcamento) {
		Desconto d1 = new DescontoPorValorMaiorQueQuinhentosNoOrcamento();
		Desconto d2 = new DescontoPorMaisDeCincoItens();
		Desconto d3 = new DescontoPorValorMaiorQueMilNoOrcamento();
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(new SemDesconto());

		return d1.calculaDesconto(orcamento);
	}
}
