package Intermediario;

public class Main {
    public static void main(String[] args) {
        Ninja sasuke = new Ninja();

        sasuke.name = "Sasuke";
        sasuke.age = 18;
        sasuke.village = "Aldeia da Folha";

        sasuke.shariganAtivado();

        Ninja naruto = new Ninja();
        naruto.name = "Naruto";
        naruto.age = 15;
        naruto.village = "Aldeia da Folha";

        System.out.println(naruto.saudacao());
    }
}
