package Desafios.Desafio03;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke";
        sasuke.age = 20;
        sasuke.specialAbility = "Dar emprego";
        sasuke.mission = "Ajudar a gio a conseguir um trampo";
        sasuke.missionStatus = "Pendente";

        sasuke.mostrarInformacao();
        sasuke.mostrarHabilidadeEspecial();
    }
}
