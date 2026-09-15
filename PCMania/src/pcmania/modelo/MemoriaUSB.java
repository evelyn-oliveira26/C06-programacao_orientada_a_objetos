package pcmania.modelo;

public class MemoriaUSB {
    private String nome;
    private int capacidade;
    
    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String descricao() {
        return (nome + " de " + capacidade + "Gb");
    }
}
