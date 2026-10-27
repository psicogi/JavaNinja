package Intermediario.ClassesAbstratas;

public abstract class Hokage {
    String name;
    int age;
    boolean aliveOrNot;
    String village;
    int mission;
    double bankBalance;
    double height;

    public Hokage() {
    }

    public Hokage(String name, int age, boolean aliveOrNot, String village, int mission, double bankBalance, double height) {
        this.name = name;
        this.age = age;
        this.aliveOrNot = aliveOrNot;
        this.village = village;
        this.mission = mission;
        this.bankBalance = bankBalance;
        this.height = height;
    }

    public abstract void hokageWisdom();
}
