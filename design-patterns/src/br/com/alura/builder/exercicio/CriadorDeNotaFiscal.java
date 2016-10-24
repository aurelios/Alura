package br.com.alura.builder.exercicio;

import java.util.Calendar;

public class CriadorDeNotaFiscal {

	private NotaFiscal notaFiscal = new NotaFiscal();
	
	public CriadorDeNotaFiscal() {
		this.notaFiscal.setDataDeEmissao(Calendar.getInstance());
	}

	public CriadorDeNotaFiscal comRazaoSozial(String razaoSocial) {
		this.notaFiscal.setRazaoSocial(razaoSocial);
		return this;
	}
	
	public CriadorDeNotaFiscal comCnpj(String cnpj) {
		this.notaFiscal.setCnpj(cnpj);
		return this;
	}

	public CriadorDeNotaFiscal comItem(ItemDaNota itemDaNota) {
		this.notaFiscal.adicionaItem(itemDaNota);
		this.notaFiscal.somaValorBruto(itemDaNota.getValor());
		this.notaFiscal.calculaImpostos();
		return this;
	}
	
	public CriadorDeNotaFiscal naDataAtual() {
		this.notaFiscal.setDataDeEmissao(Calendar.getInstance());
		return this;
	}
	
	public CriadorDeNotaFiscal naData(Calendar data) {
		this.notaFiscal.setDataDeEmissao(data);
		return this;
	}

	public NotaFiscal constroi() {
		return this.notaFiscal;
	}
	
}
