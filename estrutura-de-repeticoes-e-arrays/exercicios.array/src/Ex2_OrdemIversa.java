
/*Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.*/
public class Ex2_OrdemIversa {
    public static void main(String[] args) {
        int[] vetor = {6, 2, 32, 10, 65, 98, 41, 23, 3, 64};
        int count = 0;

        System.out.println("\nVetor: ");
        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
