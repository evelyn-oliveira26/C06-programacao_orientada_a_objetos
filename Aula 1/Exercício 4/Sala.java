import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de alunos matriculados em C06: ");
        int n_alunos = entrada.nextInt();

        switch (n_alunos) {
            case 10:
                System.out.println("A sala utilizada será a I-16.");
                break;

            case 20:
                System.out.println("A sala utilizada será a I-16.");
                break;

            case 30:
                System.out.println("A sala utilizada será a I-22.");
                break;

            default:
                System.out.println("A sala utilizada está sendo checada com o CRA!");
        }
        entrada.close();
    }
}
