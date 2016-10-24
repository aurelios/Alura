package br.com.alura.chainofresponsability.exercicio;

interface Resposta {
    void responde(Requisicao req, Conta conta);
    void setProxima(Resposta resposta);
  }