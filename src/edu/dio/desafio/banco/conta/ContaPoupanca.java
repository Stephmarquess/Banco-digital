package edu.dio.desafio.banco.conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nomecliente) {
        super(nomecliente);
        setTipo("Poupança");
    }

    @Override
    public void informacoes() {
       setTipo("Poupança");
    }

}
