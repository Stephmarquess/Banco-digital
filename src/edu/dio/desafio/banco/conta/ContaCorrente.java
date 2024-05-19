package edu.dio.desafio.banco.conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nomecliente) {
        super(nomecliente);
        setTipo("Corrente");
    }
}
