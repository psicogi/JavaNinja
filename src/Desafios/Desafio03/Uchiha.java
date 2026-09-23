package Desafios.Desafio03;

public class Uchiha extends Ninja {
    String specialAbility;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Eu sou o(a) " + name + " e essa é a minha habilidade especial: " + specialAbility);
    }

    @Override
    public void mostrarInformacao() {
        super.mostrarInformacao();
        System.out.println("Habilidade especial: " + specialAbility);
    }
}
