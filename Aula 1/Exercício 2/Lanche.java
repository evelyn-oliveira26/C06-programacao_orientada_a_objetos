//contagem de lanches consumidos durante um fim de semana
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de lanches consumidos na sexta-feira: ");
        int lanche1 = entrada.nextInt();

        System.out.print("Digite o número de lanches consumidos no sábado: ");
        int lanche2 = entrada.nextInt();

        System.out.print("Digite o número de lanches consumidos no domingo: ");
        int lanche3 = entrada.nextInt();

        int soma = lanche1 + lanche2 + lanche3;
        double media = soma / 3.0;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);

        entrada.close();
    }
}
