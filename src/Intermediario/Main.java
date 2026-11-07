package Intermediario;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha("Sasuke", "Aldeia da Folha", 18);
        sasuke.habilidade();
        sasuke.shariganAtivado();

        System.out.println("-----------------------");

        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 15);
        naruto.habilidade();
        System.out.println(naruto.saudacao());
        naruto.uzumaki();

        System.out.println("-----------------------");

        Boruto boruto = new Boruto("Boruto", "Aldeia da Folha", 19);
        boruto.AtivarKarma();
        boruto.AtivarJougan();

        System.out.println("-----------------------");

        Hatake kakashi = new Hatake("Kakashi", "Aldeia da Folha", 19);
        kakashi.ninjaDeElite();
        kakashi.saudacao();

        System.out.println("-----------------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, Rank.HOKAGE);
        madara.habilidade();
        madara.estrategiaBatalha();
        madara.inteligenciaCombate();
        madara.inteligenciaCombate(145);
        System.out.println(madara);
    }
}
