package Intermediario;

public abstract class Ninja implements EstrategiaBatalha {
    String name, village;
    int age;
    int numberOfMissionsCompleted;
    Rank level;

    // TODO: incluir 2 novos atributos: numberOfMissionsCompleted and rank
    // TODO: Rank: Gennin, Chunnin, Jounnin e Hokage

    public Ninja() {
    }

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public Ninja(String name, String village, int age, int numberOfMissionsCompleted, Rank level) {
        // sobrecarga referenciando o construtor acima
        this(name, village, age);
        this.numberOfMissionsCompleted = numberOfMissionsCompleted;
        this.level = level;
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

    public void inteligenciaCombate() {
        System.out.println("meu nome é: " + name + " e essa é a minha inteligencia de combate");
    }

    public void inteligenciaCombate(int qi) {
        if (qi > 150) {
            System.out.println("seu QI é: " + qi + " e voce é um genio");
        } else {
            System.out.println("seu QI é: " + qi + " e voce é um jenio");
        }
    }
}
