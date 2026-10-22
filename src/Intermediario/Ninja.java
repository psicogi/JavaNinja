package Intermediario;

public class Ninja {
    String name, village;
    int age;

    public String saudacao() {
        return "Oi, boa noite, eu sou o " + name;
    }

    public void habilidade() {
        System.out.println("Meu nome é " + name + ", e esse é o meu ataque especial");
    }
}
