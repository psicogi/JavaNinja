package Desafios.Desafio04;

public class NinjaAvancado implements Ninja {
    String nome, habilidade, especialidade;
    int idade;

    public NinjaAvancado(String nome, String habilidade, String especialidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é: " + nome + "\nTenho " + idade + " anos\nMinha especialidade é: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando habilidade: " + habilidade);
    }
}
