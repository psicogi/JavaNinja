package Intermediario;

public enum Rank {
    GENIN("ninja beta", 1),
    CHUUNIN("aprendendo a se portar", 2),
    JOUNIN("virando bom", 3),
    HOKAGE("o ++", 4);

    private String descricao;
    private int dificuldade;

    Rank() {
    }

    Rank(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }
}
