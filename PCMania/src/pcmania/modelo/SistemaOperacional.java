package pcmania.modelo;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String descricao() {
        return (nome + " (" + tipo + " bits)");
    }
}
