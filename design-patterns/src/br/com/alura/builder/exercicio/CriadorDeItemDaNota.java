package br.com.alura.builder.exercicio;

public class CriadorDeItemDaNota {

	private ItemDaNota itemDaNota = new ItemDaNota();

	public CriadorDeItemDaNota comDescricao(String descricao) {
		this.itemDaNota.setDescricao(descricao);
		return this;
	}

	public ItemDaNota build() {
		return this.itemDaNota;
	}
	
}
