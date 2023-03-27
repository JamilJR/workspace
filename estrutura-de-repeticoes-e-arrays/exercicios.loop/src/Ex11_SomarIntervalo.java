import java.util.Scanner;

/*Faça um programa que receba dois números inteiros
  e gere os números inteiros que estão no intervalo compreendido por eles.
  Altere o programa anterior para mostrar no final a soma dos números.
*/
public class Ex11_SomarIntervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int primeiroNumero, segundoNumero, soma = 0;

        System.out.print("Primeiro numero: ");
        primeiroNumero = scan.nextInt();
        System.out.print("Segundo numero: ");
        segundoNumero = scan.nextInt();

        if(primeiroNumero < segundoNumero) {
            for (int i = (primeiroNumero + 1); i < segundoNumero; i++) {
                System.out.println("Intervalo: " + i);
                soma = soma + i;
            }
            System.out.println("Soma do intervalo: " + soma);

        }else if (primeiroNumero > segundoNumero){
            for (int i = (primeiroNumero - 1); i > segundoNumero; i--) {
                System.out.println("Intervalo: " + i);
                soma = soma + i;
            }
            System.out.println("Soma do intervalo: " + soma);
        }
    }
}

