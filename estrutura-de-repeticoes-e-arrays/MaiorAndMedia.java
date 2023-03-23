import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorAndMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (maior < numero) maior = numero;
            soma = soma + numero;
            count++;
        } while (count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }

}
