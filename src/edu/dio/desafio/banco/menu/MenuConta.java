package edu.dio.desafio.banco.menu;

import edu.dio.desafio.banco.conta.Conta;
import edu.dio.desafio.banco.conta.ContaCorrente;
import edu.dio.desafio.banco.conta.ContaPoupanca;

import java.util.Scanner;

public class MenuConta {

    public void menu(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {

        Scanner entrada = new Scanner(System.in);
        int menuOpcao;
        System.out.println("\n Bem vindo(a)," + contaPoupanca.getNomecliente());

        do {

            System.out.println("\n Em qual conta deseja realizar operações?");
            System.out.println("\n 1- Conta Corrente \n 2 - Conta Poupança \n 3- Sair");
            int opcaoConta = entrada.nextInt();


            switch (opcaoConta) {
                case 1:
                    System.out.println("Conta corrente");
                    System.out.println("Saldo:" + contaCorrente.getSaldo());
                    System.out.println("\n 1- Depositar \n 2 - Sacar \n 3- Transferir para poupança");
                    int opcaoCorrente = entrada.nextInt();

                    switch (opcaoCorrente) {
                        case 1:
                            System.out.println("Valor do depósito");
                            Double valorDeposito = entrada.nextDouble();
                            contaCorrente.deposito(valorDeposito);
                            break;
                        case 2:
                            System.out.println("Valor do saque:");
                            Double valorSaque = entrada.nextDouble();
                            contaCorrente.sacar(valorSaque);
                            break;
                        case 3:
                            System.out.println("Valor de transferência:");
                            Double valorTransferencia = entrada.nextDouble();
                            Conta contaDestino = contaPoupanca;
                            contaCorrente.transferir(valorTransferencia, contaDestino);
                            break;

                        default:
                            System.out.println("Digite uma opção válida!");
                    }
                    break;
                case 2:
                    System.out.println("Conta poupança");
                    System.out.println("Saldo:" + contaPoupanca.getSaldo());
                    System.out.println("\n 1- Depositar \n 2 - Sacar \n 3 - Transferir para corrente");
                    int opcaoContaPoupanca = entrada.nextInt();

                    switch (opcaoContaPoupanca) {
                        case 1:
                            System.out.println("Valor do depósito");
                            Double valorDeposito = entrada.nextDouble();
                            contaPoupanca.deposito(valorDeposito);
                            break;

                        case 2:
                            System.out.println("Valor do saque:");
                            Double valorSaque = entrada.nextDouble();
                            contaPoupanca.sacar(valorSaque);
                            break;

                        case 3:
                            System.out.println("Valor de transferência:");
                            Double valorTransferencia = entrada.nextDouble();
                            Conta contaDestino = contaCorrente;
                            contaPoupanca.transferir(valorTransferencia, contaDestino);
                            break;
                    }
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
            }
            System.out.println("Finalizar?");
            menuOpcao = entrada.nextInt();
        } while (menuOpcao != 0);
    }
}