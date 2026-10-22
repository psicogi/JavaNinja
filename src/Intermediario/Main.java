package Intermediario;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();

        sasuke.name = "Sasuke";
        sasuke.age = 18;
        sasuke.village = "Aldeia da Folha";
        sasuke.habilidade();

        sasuke.shariganAtivado();

        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto";
        naruto.age = 15;
        naruto.village = "Aldeia da Folha";
        naruto.habilidade();

        System.out.println(naruto.saudacao());
        naruto.uzumaki();

        System.out.println("-----------------------");

        Boruto boruto = new Boruto();
        boruto.name = "Boruto";
        boruto.village = "Aldeia da Folha";
        boruto.age = 19;
        boruto.AtivarKarma();
        boruto.AtivarJougan();
    }
}
