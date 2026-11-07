package Intermediario;

public class Boruto extends Uzumaki implements HyugaUzumaki {
    public Boruto() {
    }

    public Boruto(String name, String village, int age) {
        super(name, village, age);
    }

    @Override
    public void AtivarKarma() {
        System.out.println("Eu sou um Hyuga Uzumaki");
    }

    @Override
    public void AtivarJougan() {
        System.out.println("Jougan foi ativado com sucesso!");
    }
}
