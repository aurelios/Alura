package br.com.alura.builder.exercicio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;

	private String cnpj;

	private double valorBruto;

	private double impostos;

	private Calendar dataDeEmissao;

	private String observacoes;
	
	private List<ItemDaNota> itens = new ArrayList<>();

	public NotaFiscal(String razaoSocial, String cnpj, double valorBruto,
			double impostos, Calendar dataDeEmissao, String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.dataDeEmissao = dataDeEmissao;
		this.observacoes = observacoes;
	}

	public NotaFiscal() {
	}

	@Override
	public String toString() {
		return "NotaFiscal [cnpj=" + cnpj + ", valorBruto=" + valorBruto + "]";
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	public void setDataDeEmissao(Calendar dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void adicionaItem(ItemDaNota itemDaNota) {
		this.itens.add(itemDaNota);	
	}

	public void somaValorBruto(double valor) {
		this.valorBruto += valor;
	}

	public void calculaImpostos() {
		this.impostos = getValorBruto() * 0.05;
	}

}
