public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 55;
        zumbi1.nome = "Alfred";

        zumbi2.vida = 28;
        zumbi2.nome = "Raymond";

        zumbi1.transfereVida(zumbi2, 10);

        System.out.println("Zumbi 1:");
        System.out.println("Nome: " + zumbi1.nome);
        System.out.println("Vida: " + zumbi1.vida);

        System.out.println("\nZumbi 2:");
        System.out.println("Nome: " + zumbi2.nome);
        System.out.println("Vida: " + zumbi2.vida);
    }
}
