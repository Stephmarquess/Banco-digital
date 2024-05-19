package edu.dio.desafio.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nomecliente) {
        super(nomecliente);
        setTipo("Corrente");
    }
}
