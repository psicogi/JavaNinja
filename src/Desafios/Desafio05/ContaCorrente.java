package Desafios.Desafio05;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("saldo: " + saldo);
    }

    @Override
    public double depositarValor(double valor) {
        double taxa = valor * 0.01;
        saldo += valor - taxa;
        return saldo;
    }
}
