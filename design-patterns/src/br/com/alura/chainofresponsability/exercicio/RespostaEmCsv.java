package br.com.alura.chainofresponsability.exercicio;

public class RespostaEmCsv implements Resposta {
    private Resposta outraReposta;

    public void responde(Requisicao req, Conta conta) {
      if(req.getFormato() == Formato.CSV) {
        System.out.println(conta.getTitular() + "," + conta.getSaldo());
      }
      else {
        outraReposta.responde(req, conta);
      }
    }

    public void setProxima(Resposta resposta) {
      this.outraReposta = resposta;
    }
  }