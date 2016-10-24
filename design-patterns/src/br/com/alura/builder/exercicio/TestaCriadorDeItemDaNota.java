package br.com.alura.builder.exercicio;

public class TestaCriadorDeItemDaNota {

	public static void main(String[] args) {
		CriadorDeItemDaNota builder = new CriadorDeItemDaNota();
		
		ItemDaNota itemDaNota = builder.comDescricao("Computador").build();
		
		System.out.println(itemDaNota);
	}
	
}
