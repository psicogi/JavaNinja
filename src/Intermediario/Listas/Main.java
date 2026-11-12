package Intermediario.Listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // arrays sao estaticos, nao alteram o tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "naruto";
        ninjasArray[1] = "sasuke";
        ninjasArray[2] = "kakashi";

        // listas nao sao estaticas, elas podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Boruto");
        ninjasList.add("Naruto");
        ninjasList.add("Kakashi");
        System.out.println(ninjasList);

        // remover
        ninjasList.remove("Boruto");
        System.out.println(ninjasList);

        // alterar
        ninjasList.set(1, "Kakashi Hatake");
        System.out.println(ninjasList);

        // ver o tamanho da lista
        System.out.println(ninjasList.size());
    }
}
