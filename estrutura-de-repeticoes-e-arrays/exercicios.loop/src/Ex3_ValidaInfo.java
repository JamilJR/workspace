import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
  Nome: maior que 3 caracteres;
  Idade: entre 0 e 150;
  Salário: maior que zero;
  Sexo: 'f' ou 'm';
  Estado Civil: 's', 'c', 'v', 'd';
*/
public class Ex3_ValidaInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do{
            System.out.print("Nome: ");
            nome = scan.next();
        }while (nome.length()<=3);
        do{
            System.out.println("Idade:");
            idade = scan.nextInt();
        }while (idade < 0 || idade > 150);
        do{
            System.out.println("Salário: ");
            salario = scan.nextInt();
        }while (salario <= 0);
        do{
            System.out.println("Sexo: ");
            sexo = scan.next();
        }while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));
        do{
            System.out.println("Estado civíl: ");
            estadoCivil = scan.next();
        }while (!estadoCivil.equalsIgnoreCase("s") &&
                !estadoCivil.equalsIgnoreCase("c") &&
                !estadoCivil.equalsIgnoreCase("v") &&
                !estadoCivil.equalsIgnoreCase("d"));

    }
}
