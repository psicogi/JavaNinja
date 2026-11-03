package Intermediario;

public class Hatake extends Ninja implements Sharigan, Anbu {
    @Override
    public void shariganAtivado() {
        System.out.println(name + ": sharigan ativado");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(name + ": eu sou um ninja de Elite!");
    }
}
