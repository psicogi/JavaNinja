package Avancado.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("naruto uzumaki", "konoha", 20));
        ninjas.add(new Ninja("sasuke uchiha", "konoha", 25));
        ninjas.add(new Ninja("sakura haruno", "konoha", 20));
        ninjas.add(new Ninja("kakashi hatake", "konoha", 30));
        ninjas.add(new Ninja("gaara", "suna", 18));
        ninjas.add(new Ninja("temari", "suna", 19));
        ninjas.add(new Ninja("rock lee", "konoha", 17));

        // filtrando por vila
        //                            predicado
        ninjas.stream()
                // filtra os elementos
                .filter(ninja -> ninja.getVillage().equalsIgnoreCase("konoha"))
                // imprime o resultado
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

        // ordenando por idade
        ninjas.stream()
                // .sorted(Comparator.comparingInt(Ninja::getAge)) - versão shortcut que faz a mesma coisa
                .sorted((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()))
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

        // ordenando em ordem alfabetica
        ninjas.stream()
                // .sorted(Comparator.comparing(Ninja::getName)) - versão shortcut que faz a mesma coisa
                .sorted((n1, n2) -> n1.getName().compareTo((n2.getName())))
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

        // mostra e mapeia o atributo escolhido
        ninjas.stream()
                .map(Ninja::getName)
                .forEach(System.out::println);

        ninjas.stream()
                .map(Ninja::getAge)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

        // mapeia pelo maximo escolhido
        Ninja ninjaVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getAge(), n2.getAge()))
                .orElse(null);

        System.out.println("Ninja filtrado pelo mais velho:\n" + ninjaVelho);

        System.out.println("----------------------------------------------------------------");

        // mapeia pelo minimo escolhido

        Ninja ninjaNovo = ninjas.stream()
                .min((n1, n2) -> Integer.compare(n1.getAge(), n2.getAge()))
                .orElse(null);

        System.out.println("Ninja filtrado pelo mais novo:\n" + ninjaNovo);
    }
}
