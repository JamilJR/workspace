import java.util.Scanner;

public class Ex1_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota:");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Insira um valor entre 0 e 10: ");
            nota = scan.nextInt();
        }

        System.out.println("Nota " + nota + " inserida.");

    }
}
