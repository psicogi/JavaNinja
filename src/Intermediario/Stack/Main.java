package Intermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // array convencional
        // estaticos e tem referencia de memoria previa
        String[] ninjaArray = new String[3];
        // adicionando elemento no array
        ninjaArray[0] = "Naruto Uzumaki";

        // lista
        // sao dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjaList = new ArrayList<>();
        // adicionando elemento na lista
        ninjaList.add("Naruto Uzumaki");
        // removendo elemento na lista
        ninjaList.remove("Naruto Uzumaki");

        // stack
        // o ultimo elemento que entrou é o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        // adicionando elemento no stack
        ninjaStack.add("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        System.out.println(ninjaStack);
        // removendo o ultimo elemento da lista
        ninjaStack.pop();
        System.out.println("ninjaStack atualizada com pop = " + ninjaStack);
        // verificando o primeiro elemento da lista
        System.out.println("ninjaStack atualizada com peek = " + ninjaStack.peek());
        // verificando
        System.out.println("ninjaStack atualizada com isEmpty = " + ninjaStack.isEmpty());
    }
}
