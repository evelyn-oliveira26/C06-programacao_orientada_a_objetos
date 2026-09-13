import java.util.Scanner;
import java.util.Random;

public class Advinhacao {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        //número gerado pelo pc
        int num_pc = rand.nextInt(10) + 1;

        System.out.print("Advinhe o número gerado pelo computador: ");
        //número que o usuário irá entrar
        int num_user = entrada.nextInt();

        while (num_user != num_pc) {
            System.out.print("Errado. Tente novamente: ");
            num_user = entrada.nextInt();
        }

        System.out.println("Parabéns! Você advinhou o número!");

        entrada.close();
    }
}
