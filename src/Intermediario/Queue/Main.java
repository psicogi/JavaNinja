package Intermediario.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // array estatico
        String[] ninjasArray = new String[6];

        // lista dinamica
        List<String> ninjasList = new ArrayList<>();

        // stack que funciona como um historico de google | LIFO - Last in, first out
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.add("Naruto");
        ninjasStack.add("Sasuke");
        ninjasStack.add("Sakura");
        ninjasStack.add("Kakashi");
        ninjasStack.add("Shikamaru");

        System.out.println("Ninjas no Stack: " + ninjasStack);

        // queue que funciona como o stack so que ao contrario | FIFO - First in, first out
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        System.out.println("Ninjas na fila: " + ninjasQueue);
        // atende o head da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na fila: " + ninjasQueue);
        // retorna o head da fila
        System.out.println("Ninjas na fila: " + ninjasQueue.peek());

        if (ninjasQueue.isEmpty()) {
            System.out.println("a lista esta vazia");
        }







    }
}
