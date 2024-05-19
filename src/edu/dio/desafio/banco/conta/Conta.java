package edu.dio.desafio.banco.conta;

public abstract class Conta {

    private int numero = 1;
    private final int agencia = 19; // Definir um número estático
    private String nomecliente;
    private double saldo;
    private String tipo;

    public Conta(String nomecliente) {
        super();
        this.nomecliente = nomecliente;
        this.numero += 1;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void deposito(double valor) {
        this.saldo += valor;

        System.out.println("Depósito realizado");
        System.out.println("Saldo atual: " + getSaldo());

    }

    public void sacar(double valor) {

        if (valor <= getSaldo()) {
            this.setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Não foi possível realizar o saque!");
            System.out.println("Valor do saque maior que o saldo da conta");
        }

    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo) {
            setSaldo(saldo-valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Saldo atual: " + getSaldo());
        } else {
            System.out.println("Tansferência cancelada. Valor de saque maior que o saldo da conta.");
            System.out.println("Saldo: " + getSaldo());
        }
    }

    public void informacoes() {
        System.out.print("----- DETALHES DA CONTA -----" +
                "\n Conta: " + getTipo() +
                "\n Cliente: " + getNomecliente() +
                "\n Agencia: " + getAgencia() +
                "\n Numero: " + getNumero() +
                "\n Saldo: " + getSaldo());
    }
}
