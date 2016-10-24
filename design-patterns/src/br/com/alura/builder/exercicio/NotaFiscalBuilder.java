package br.com.alura.builder.exercicio;

import java.util.Calendar;

public class NotaFiscalBuilder {

	private NotaFiscal notaFiscal = new NotaFiscal();
	
	public NotaFiscalBuilder() {
		this.notaFiscal.setDataDeEmissao(Calendar.getInstance());
	}

	public NotaFiscalBuilder comRazaoSozial(String razaoSocial) {
		this.notaFiscal.setRazaoSocial(razaoSocial);
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.notaFiscal.setCnpj(cnpj);
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota itemDaNota) {
		this.notaFiscal.adicionaItem(itemDaNota);
		this.notaFiscal.somaValorBruto(itemDaNota.getValor());
		this.notaFiscal.calculaImpostos();
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual() {
		this.notaFiscal.setDataDeEmissao(Calendar.getInstance());
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data) {
		this.notaFiscal.setDataDeEmissao(data);
		return this;
	}

	public NotaFiscal constroi() {
		return this.notaFiscal;
	}
	
}
