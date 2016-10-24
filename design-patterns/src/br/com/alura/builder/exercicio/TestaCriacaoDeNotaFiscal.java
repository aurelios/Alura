package br.com.alura.builder.exercicio;

import java.util.Calendar;

public class TestaCriacaoDeNotaFiscal {

	public static void main(String[] args) {
		NotaFiscalBuilder criador = new NotaFiscalBuilder();
		NotaFiscal notaFiscal = criador
				.comRazaoSozial("Razao social")
				.comItem(new ItemDaNota("computador", 2500))
				.naData(Calendar.getInstance())
				.comCnpj("12345").constroi();
		
		System.out.println(notaFiscal);
	}
}
