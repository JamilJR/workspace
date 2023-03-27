import java.util.Scanner;

/*Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse
ou iguale a população do país B, mantidas as taxas de crescimento.
*/
public class Ex5_PopulacaoUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean paraContinuar = false;


        while (!paraContinuar){
            int count = 0;
            System.out.print("Número de habitantes do pais A: ");
            double paisA = scan.nextDouble();
            System.out.print("Taxa de crescimento do pais A: ");
            double taxaA = (1+(scan.nextDouble()/100.0));

            System.out.print("Número de habitantes do pais B: ");
            double paisB = scan.nextDouble();
            System.out.print("Taxa de crescimento do pais B: ");
            double taxaB = (1+(scan.nextDouble()/100.0));

            do{
                count++;
                paisA *= taxaA;
                paisB *= taxaB;
            }while (paisA < paisB);

            System.out.println("Pais A: " + paisA);
            System.out.println("Pais B: " + paisB);
            System.out.println("A população do pais A será maior que a do pais B em " + count + " anos.");

            System.out.println("Voçê deseja continuar? (S/N)");
            String repeat = scan.next();

            if(repeat.equalsIgnoreCase("n"))
                paraContinuar = true;

        }
    }

}
