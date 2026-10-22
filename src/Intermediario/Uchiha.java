package Intermediario;

public class Uchiha extends Ninja{

    public void shariganAtivado() {
        System.out.println("Meu nome é: " + name + ". O Sharigan esta ativado pq sou um Uchiha! ");
    }

    @Override
    public void habilidade() {
        System.out.println("Meu nome é " + name + ", e esse é o meu ataque Uchiha");
    }
}
