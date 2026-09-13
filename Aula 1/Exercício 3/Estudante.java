import java.util.Scanner;

public class Estudante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua NPA: ");
        int NPA = entrada.nextInt();

        if (NPA >= 60) {
            System.out.println("Parabéns! Aprovado.");
        } else if (NPA < 30) {
            System.out.println("Reprovado.");
        } else {
            System.out.print("Você ficou de recuperação! Informe a nota da sua NP3: ");
            int NP3 = entrada.nextInt();
            
            int soma = NPA + NP3;
            double NFA = soma / 2.0;

            if (NFA >= 50) {
                System.out.println("Parabéns! Você passou.");
            } else {
                System.out.println("Você está reprovado!");
            }
        }
        entrada.close();
    }
}
