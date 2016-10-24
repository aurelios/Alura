package br.com.alura.strategy.calculadora;

public class TesteICCC {
	
	public static void main(String[] args) {
        Orcamento reforma = new Orcamento(1500.0);

        Imposto novoImposto = new ICCC();
        System.out.println(novoImposto.calculaImposto(reforma));
      }

}
