package Intermediario.Generics;

import java.util.ArrayList;
import java.util.List;

//                        simbolo passado para indicar uma classe generica
//                        pode colocar qualquer coisa mas o T é de Type e funciona como uma boa pratica
public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void adicionarEquipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    @Override
    public String toString() {
        return "a Bolsa Generica tem: " + equipamentos.toString();
    }
}
