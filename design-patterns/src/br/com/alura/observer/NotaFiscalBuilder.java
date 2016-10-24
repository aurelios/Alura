package br.com.alura.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.builder.exercicio.ItemDaNota;
import br.com.alura.builder.exercicio.NotaFiscal;

public class NotaFiscalBuilder {

	private NotaFiscal notaFiscal = new NotaFiscal();
	
	private List<AcaoAposNotaFiscal> acoesParaSeremExecutadas;
	
	public NotaFiscalBuilder() {
		this.acoesParaSeremExecutadas = new ArrayList<>();
		this.notaFiscal.setDataDeEmissao(Calendar.getInstance());
	}

	public NotaFiscalBuilder adicionaAcao(AcaoAposNotaFiscal acao) {
		this.acoesParaSeremExecutadas.add(acao);
		return this;
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
		NotaFiscal nf = this.notaFiscal;
		
		//acoes que precisam ser tomadas apos construir uma Nota Fiscal
		for (AcaoAposNotaFiscal acao : acoesParaSeremExecutadas) {
			acao.executa(nf);
		}
		
		return nf;
	}

}
