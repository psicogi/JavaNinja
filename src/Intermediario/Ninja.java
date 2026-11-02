package Intermediario;

public abstract class Ninja implements EstrategiaBatalha {
    String name, village;
    int age;

    public Ninja() {
    }

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public String saudacao() {
        return "Oi, boa noite, eu sou o " + name;
    }

    public void habilidade() {
        System.out.println("Meu nome é " + name + ", e esse é o meu ataque especial");
    }

    public void estrategiaBatalha() {
        System.out.println("essa é a minha estrategia de batalha");
    }
}
