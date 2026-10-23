package Desafios.Desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico nb = new NinjaBasico("Ninja Basico 01", "Fogo", 19);
        NinjaAvancado na = new NinjaAvancado("Ninja Avançado 01", "Raio", "Choque", 25);

        nb.mostrarInformacoes();
        nb.executarHabilidade();

        System.out.println("----------------------------------------");

        na.mostrarInformacoes();
        na.executarHabilidade();
    }
}
