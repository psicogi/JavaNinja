package Desafios.Desafio06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        * TODO
        * Adicionar 7 ninjas à lista
        * Exibir a lista completa
        * Remover o primeiro ninja
        * Adicionar um novo ninja no início
        * Acessar um ninja em uma posição específica
        */
        LinkedList<Ninja> ninjas = new LinkedList<>();
        ninjas.add(new Ninja("ninja 01", "aldeia 01", 18));
        ninjas.add(new Ninja("ninja 02", "aldeia 02", 19));
        ninjas.add(new Ninja("ninja 03", "aldeia 03", 20));
        ninjas.add(new Ninja("ninja 04", "aldeia 04", 21));
        ninjas.add(new Ninja("ninja 05", "aldeia 05", 22));
        ninjas.add(new Ninja("ninja 06", "aldeia 06", 23));
        ninjas.add(new Ninja("ninja 07", "aldeia 07", 24));

        System.out.println(ninjas);

        System.out.println("----------------------------------------------");

        ninjas.remove(0);

        System.out.println(ninjas);

        System.out.println("----------------------------------------------");

        ninjas.addFirst(new Ninja("ninja novo", "aldeia nova", 18));

        System.out.println(ninjas);

        System.out.println("----------------------------------------------");

        System.out.println(ninjas.get(5));
    }
}
