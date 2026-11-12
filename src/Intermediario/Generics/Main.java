package Intermediario.Generics;

public class Main {
    public static void main(String[] args) {
        // sem generics
        Kunai kunai01 = new Kunai("Kunai");
        Kunai kunai02 = new Kunai("Kunai explosiva");
        Kunai kunai03 = new Kunai("Kunai de agua");

        BolsaKunai bolsa = new BolsaKunai();
        bolsa.adicionarKunai(kunai01);
        System.out.println(bolsa);
        bolsa.adicionarKunai(kunai02);
        System.out.println(bolsa);
        bolsa.adicionarKunai(kunai03);
        System.out.println(bolsa);

        System.out.println("----------------------------------------------");

        // com generics
        EquipamentosNinja kunaiGenerica = new EquipamentosNinja("Kunai de Ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamento(kunaiGenerica);
        bolsaGenerica.adicionarEquipamento(shuriken);
        bolsaGenerica.adicionarEquipamento(pergaminho);

        System.out.println(bolsaGenerica);
    }
}
