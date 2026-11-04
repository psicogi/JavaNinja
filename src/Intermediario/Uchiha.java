package Intermediario;

public class Uchiha extends Ninja implements Sharigan {

    public Uchiha() {
    }

    public Uchiha(String name, String village, int age) {
        // referencia os atributos/construtor da super classe
        super(name, village, age);
    }

    public Uchiha(String name, String village, int age, int numberOfMissionsCompleted, Rank level) {
        super(name, village, age, numberOfMissionsCompleted, level);
    }

    @Override
    public void shariganAtivado() {
        System.out.println("Meu nome é: " + name + ". O Sharigan esta ativado pq sou um Uchiha! ");
    }

    @Override
    public void habilidade() {
        System.out.println("Meu nome é " + name + ", e esse é o meu ataque Uchiha. Eu ja completei: " + numberOfMissionsCompleted + " missoes");
    }
}
