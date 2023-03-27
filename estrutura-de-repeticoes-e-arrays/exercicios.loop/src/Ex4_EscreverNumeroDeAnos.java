
/*Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse
ou iguale a população do país B, mantidas as taxas de crescimento.
*/
public class Ex4_EscreverNumeroDeAnos {
    public static void main(String[] args) {
        double paisA = 80000;
        double taxaA = (1+0.03);
        double paisB = 200000;
        double taxaB = (1+0.015);
        double count = 0;

        do{
            count += 1;
            paisA = paisA * taxaA;
            paisB = paisB * taxaB;
        }while (paisA < paisB);
        System.out.println("Populaçao do pais A: " + paisA);
        System.out.println("População do pais B:  " + paisB);
        System.out.println("A população do pais A será maior que a população do pais B em " + count + " anos.");
    }

}
