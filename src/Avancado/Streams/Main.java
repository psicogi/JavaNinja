package Avancado.Streams;

import java.util.ArrayList;
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

        // sintaxe streams
        //                            predicado
        ninjas.stream()
                // filtra os elementos
                .filter(ninja -> ninja.getVillage().equalsIgnoreCase("konoha"))
                // imprime o resultado
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

        ninjas.stream()
                .sorted((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()))
                .forEach(System.out::println);
    }
}
