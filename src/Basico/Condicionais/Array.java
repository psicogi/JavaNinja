package Basico.Condicionais;

public class Array {
    public static void main(String[] args) {
        String[] equipe = {"Giovania", "Cauã", "Gmaia", "Cash", "Gabriel"};
        for(int i = 0; i < equipe.length; i++){
            System.out.println(equipe[i]);
        }

        int[] maioridade = {10, 15, 17, 18, 20};
        for (int i = 0; i < maioridade.length; i++) {
            if (maioridade[i] >= 18) {
                System.out.println("de maior: " + maioridade[i]);
            } else {
                System.out.println("menor: " + maioridade[i]);
            }
        }
    }
}
