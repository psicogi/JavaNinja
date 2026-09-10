package Condicionais;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        String maioridade = (idade >= 18) ? "maior de idade" : "menor de idade";

        System.out.print(maioridade);

        sc.close();
    }
}
