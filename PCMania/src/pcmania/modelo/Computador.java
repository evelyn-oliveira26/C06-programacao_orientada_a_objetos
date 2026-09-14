package pcmania.modelo;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardware;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico[] hardware, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);

        for (int i = 0; i < hardware.length; i++) {
            System.out.println(hardware[i].descricao());
        }

        System.out.println("S.O.: " + sistemaOperacional.descricao());
        System.out.println("Acompanha: " + memoriaUSB.descricao());
    }
}