package Desafios.Desafio04;

public class NinjaBasico implements Ninja {
    String nome, habilidade;
    int idade;

    public NinjaBasico(String nome, String habilidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é: " + nome + "\nTenho " + idade + " anos");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando habilidade: " + habilidade);
    }
}
