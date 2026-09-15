package pcmania.modelo;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int qntde;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[20];
        this.qntde = 0;
    }

    public void comprar(Computador pc) {
        computadores[qntde] = pc;
        qntde++;
    }

    public Computador[] getComputadores() {
        Computador[] comprados = new Computador[qntde];
        for (int i = 0; i < qntde; i++) {
            comprados[i] = computadores[i];
        }
        return comprados;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qntde; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public void mostraDados() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println();

        for (int i = 0; i < qntde; i++) {
            System.out.println("PC " + (i + 1) + ":");
            computadores[i].mostraPCConfigs();
            System.out.println();
        }

        System.out.println("Total da compra: R$ " + calculaTotalCompra());
    }
}
