import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex14_parEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumero, numero;
        int quantPares = 0, quantImpares = 0;
        int count = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumero = scan.nextInt();

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if(numero %2 == 0) quantPares++;
            else quantImpares++;
            count++;

        }while(count < quantNumero);
        System.out.println("Quantidade de números pares:" + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);

    }
}
