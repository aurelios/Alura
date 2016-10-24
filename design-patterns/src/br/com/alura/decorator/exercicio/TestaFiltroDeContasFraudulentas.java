package br.com.alura.decorator.exercicio;

import java.util.Arrays;
import java.util.List;

public class TestaFiltroDeContasFraudulentas {

	public static void main(String[] args) {
		Conta contaA = new Conta(90);
		Conta contaB = new Conta(120);
		Conta contaC = new Conta(510000);
		
		FiltroSaldoMenorQue100Reais filtro = new FiltroSaldoMenorQue100Reais(new FiltroSaldoMaiorQue500Mil());
		FiltroDeContasFraudulentas filtradorDeContas = new FiltroDeContasFraudulentas(filtro);
		List<Conta> contasFraudulentas = filtradorDeContas.filtrarContas(Arrays.asList(contaA, contaB, contaC));
		
		System.out.println(contasFraudulentas);
	}
	
}
