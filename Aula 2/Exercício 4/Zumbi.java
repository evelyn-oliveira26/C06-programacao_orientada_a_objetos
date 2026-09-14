public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (vida >= quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        return false;
    }
}
