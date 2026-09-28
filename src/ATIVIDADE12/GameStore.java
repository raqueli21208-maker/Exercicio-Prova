package ATIVIDADE12;

import java.util.Scanner;

public class GameStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] jogos = new String[5];
        int[] estoque = new int[5];
        int cadastrados = 0;
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("1 - Cadastrar jogo");
            System.out.println("2 - Listar estoque");
            System.out.println("3 - Vender jogo");
            System.out.println("4 - Repor estoque");
            System.out.println("5 - Consultar jogo");
            System.out.println("6 - Ver total de unidades");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {

                if (cadastrados == 5) {
                    System.out.println("Estoque cheio");
                } else {
                    System.out.println("Nome do jogo: ");
                    String nome = sc.next();

                    System.out.println("Quantidade inicial: ");
                    int qtd = sc.nextInt();

                    if (qtd < 0) {
                        System.out.println("Quantidade invalida!");
                    } else {
                        jogos[cadastrados] = nome;
                        estoque[cadastrados] = qtd;
                        cadastrados = cadastrados + 1;

                        System.out.println("Jogo cadastrado com sucesso!");
                    }
                }

            } else if (opcao == 2) {

                if (cadastrados == 0) {
                    System.out.println("Nenhum jogo cadastrado.");
                } else {
                    for (int i = 0; i < cadastrados; i++) {
                        System.out.println((i + 1) + " - " + jogos[i] + ": " + estoque[i] + " unidades");
                    }
                }

            } else if (opcao == 3) {

                if (cadastrados == 0) {
                    System.out.println("Nenhum jogo cadastrado.");
                } else {
                    for (int i = 0; i < cadastrados; i++) {
                        System.out.println((i + 1) + " - " + jogos[i] + ": " + estoque[i] + " unidades");
                    }

                    System.out.println("Escolha o jogo: ");
                    int numero = sc.nextInt();

                    if (numero < 1 || numero > cadastrados) {
                        System.out.println("Escolha invalida!");
                    } else {
                        System.out.println("Quantidade para vender: ");
                        int qtdVenda = sc.nextInt();
                        int pos = numero - 1;

                        if (qtdVenda <= 0) {
                            System.out.println("Escolha invalida!");
                        } else if (qtdVenda > estoque[pos]) {
                            System.out.println("Estoque insuficiente!");
                        } else {
                            estoque[pos] = estoque[pos] - qtdVenda;

                            System.out.println("Venda realizada! " + jogos[pos]
                                    + " agora tem " + estoque[pos] + " unidades.");
                        }
                    }
                }

            } else if (opcao == 4) {

                if (cadastrados == 0) {
                    System.out.println("Nenhum jogo cadastrado.");
                } else {
                    for (int i = 0; i < cadastrados; i++) {
                        System.out.println((i + 1) + " - " + jogos[i] + ": " + estoque[i] + " unidades");
                    }

                    System.out.println("Escolha o jogo: ");
                    int numero = sc.nextInt();

                    if (numero < 1 || numero > cadastrados) {
                        System.out.println("Escolha invalida!");
                    } else {
                        System.out.println("Quantidade recebida: ");
                        int qtdRepor = sc.nextInt();
                        int pos = numero - 1;

                        if (qtdRepor <= 0) {
                            System.out.println("Escolha invalida!");
                        } else {
                            estoque[pos] = estoque[pos] + qtdRepor;

                            System.out.println("Estoque reposto! " + jogos[pos]
                                    + " agora tem " + estoque[pos] + " unidades.");
                        }
                    }
                }

            } else if (opcao == 5) {

                if (cadastrados == 0) {
                    System.out.println("Nenhum jogo cadastrado.");
                } else {
                    System.out.println("Digite o numero do jogo: ");
                    int numero = sc.nextInt();

                    if (numero < 1 || numero > cadastrados) {
                        System.out.println("Jogo nao encontrado!");
                    } else {
                        int pos = numero - 1;

                        System.out.println(jogos[pos] + ": " + estoque[pos] + " unidades");
                    }
                }

            } else if (opcao == 6) {

                int total = 0;

                for (int i = 0; i < cadastrados; i++) {
                    total = total + estoque[i];
                }

                System.out.println("Total de unidades: " + total);

            } else if (opcao == 0) {

                System.out.println("Ate mais!");

            } else {

                System.out.println("Opcao invalida!");
            }
        }


    }
}

