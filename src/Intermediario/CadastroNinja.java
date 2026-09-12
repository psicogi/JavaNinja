package Intermediario;

import java.util.Scanner;

public class CadastroNinja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        System.out.println("Digite a qtd de ninjas que deseja cadastrar: ");
        int qtd = sc.nextInt();
        String[] ninjas =  new String[qtd];

        do {
            System.out.println("MENU NINJAS");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Exibir Ninjas");
            System.out.println("3 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < qtd; i++) {
                        System.out.println("Digite o nome do ninja " + (i + 1) + ": ");
                        ninjas[i] = sc.next();
                    }
                    break;
                case 2:
                    for (String ninja : ninjas) {
                        System.out.println(ninja);
                    }
                break;
                case 3:
                    System.out.println("Programa finalizado!");
                break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (opcao != 3);

        sc.close();
    }
}
