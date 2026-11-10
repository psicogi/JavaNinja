package Intermediario;

public class Uzumaki extends Ninja {
    public Uzumaki() {
    }

    public Uzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    public void uzumaki() {
        System.out.println("me chamo " + getName() + " e sou uzumaki bb");
    }

    @Override
    public void habilidade() {
        System.out.println("Meu nome é " + getName() + ", e esse é o meu ataque Uzumaki");
    }
}
