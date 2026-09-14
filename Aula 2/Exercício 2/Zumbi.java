public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia) {
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}
