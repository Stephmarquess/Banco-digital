package edu.dio.desafio.banco;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nomeCliente;

        System.out.println("----- Bem vindo(a) ao Ca$hBank! -----");
        System.out.println("----- Criar conta ----- ");
        System.out.println("Digite o seu nome: ");
        nomeCliente = entrada.next();
        ContaCorrente contaCorrente = new ContaCorrente(nomeCliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(nomeCliente);

        System.out.println(" Conta criada com sucesso!");
        System.out.println(" Agora você possui 01 conta corrente e 01 conta poupança. ");

        MenuConta menu = new MenuConta();
        menu.menu(contaCorrente, contaPoupanca);


    }
}
