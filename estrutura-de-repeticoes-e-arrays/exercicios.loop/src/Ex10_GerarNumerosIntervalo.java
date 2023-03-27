import java.util.Scanner;

/*Faça um programa que receba dois números inteiros
  e gere os números inteiros que estão no intervalo compreendido por eles.
*/
public class Ex10_GerarNumerosIntervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int primeiroNumero, segundoNumero;
        System.out.print("Primeiro numero: ");
        primeiroNumero = scan.nextInt();
        System.out.print("Segundo numero: ");
        segundoNumero = scan.nextInt();

        if(primeiroNumero < segundoNumero) {
            for (int i = (primeiroNumero + 1); i < segundoNumero; i++) {
                System.out.println(i);
            }
        }else if (primeiroNumero > segundoNumero){
                for (int i = (primeiroNumero - 1); i > segundoNumero; i--) {
                    System.out.println(i);
                }
            }
        }
    }

