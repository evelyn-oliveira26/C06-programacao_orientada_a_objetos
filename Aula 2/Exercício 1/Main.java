public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();

        z1.nome = "Alfred";
        z1.idade = 54;

        System.out.println("Nome do Zumbi: " + z1.nome);
        System.out.println("Idade do Zumbi: " + z1.idade);
        z1.comerCerebro();
    }
}
