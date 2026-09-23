package Intermediario;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();

        sasuke.name = "Sasuke";
        sasuke.age = 18;
        sasuke.village = "Aldeia da Folha";

        sasuke.shariganAtivado();

        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto";
        naruto.age = 15;
        naruto.village = "Aldeia da Folha";

        System.out.println(naruto.saudacao());
        naruto.uzumaki();
    }
}
