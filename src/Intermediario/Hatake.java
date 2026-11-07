package Intermediario;

public class Hatake extends Ninja implements Sharigan, Anbu {
    public Hatake() {
    }

    public Hatake(String name, String village, int age) {
        super(name, village, age);
    }

    @Override
    public void shariganAtivado() {
        System.out.println(name + ": sharigan ativado");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(name + ": eu sou um ninja de Elite!");
    }
}
