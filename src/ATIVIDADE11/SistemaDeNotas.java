package ATIVIDADE11;

import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];
        int quantidade = 0;
        int opcao = 1;

        while (opcao != 0) {

            System.out.println(" ===== SISTEMA DE NOTAS =====");
            System.out.println("1 - Cadastrar notas");
            System.out.println("2 - Listar notas");
            System.out.println("3 - Calcular média");
            System.out.println("4 - Maior e menor nota");
            System.out.println("5 - Consultar nota por número");
            System.out.println("6 - Alterar nota");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Quantos alunos deseja cadastrar? ");
                    quantidade = sc.nextInt();

                    if (quantidade >= 1 && quantidade <= 10) {

                        for (int i = 0; i < quantidade; i++) {

                            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
                            notas[i] = sc.nextDouble();

                            while (notas[i] < 0 || notas[i] > 10) {
                                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                                System.out.println("Digite novamente: ");
                                notas[i] = sc.nextDouble();
                            }
                        }

                        System.out.println("Notas cadastradas com sucesso!");

                    } else {
                        System.out.println("Quantidade inválida! Digite um número de 1 a 10.");
                    }
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {

                        System.out.println(" ===== NOTAS CADASTRADAS =====");

                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
                        }
                    }
                    break;

                case 3:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {

                        double soma = 0;

                        for (int i = 0; i < quantidade; i++) {
                            soma = soma + notas[i];
                        }

                        double media = soma / quantidade;

                        System.out.println("Média da turma: " + media);
                    }
                    break;

                case 4:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {

                        double maior = notas[0];
                        double menor = notas[0];

                        for (int i = 1; i < quantidade; i++) {

                            if (notas[i] > maior) {
                                maior = notas[i];
                            }

                            if (notas[i] < menor) {
                                menor = notas[i];
                            }
                        }

                        System.out.println("Maior nota: " + maior);
                        System.out.println("Menor nota: " + menor);
                    }
                    break;

                case 5:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {

                        System.out.println("Digite o número do aluno: ");
                        int aluno = sc.nextInt();

                        if (aluno >= 1 && aluno <= quantidade) {
                            System.out.println("Nota do aluno " + aluno + ": " + notas[aluno - 1]);
                        } else {
                            System.out.println("Número de aluno inválido.");
                        }
                    }
                    break;

                case 6:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {

                        System.out.println("Digite o número do aluno que deseja alterar: ");
                        int aluno = sc.nextInt();

                        if (aluno >= 1 && aluno <= quantidade) {

                            System.out.println("Digite a nova nota: ");
                            double novaNota = sc.nextDouble();

                            if (novaNota >= 0 && novaNota <= 10) {

                                notas[aluno - 1] = novaNota;

                                System.out.println("Nota alterada com sucesso!");

                            } else {
                                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                            }

                        } else {
                            System.out.println("Número de aluno inválido.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}


