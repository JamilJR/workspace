import java.util.Scanner;

/*
* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
*  mostrando uma mensagem de erro e voltando a pedir as informações.
*/
public class Ex2_NomeSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String senha;

        System.out.println("Digite o nome: ");
        nome = scan.next();
        System.out.println("Digite a senha: ");
        senha = scan.next();

        while(nome.equals(senha)){
            System.out.println("Erro: nome e senha náo podem ser iguais!");
            System.out.println("Digite o nome: ");
            nome = scan.next();
            System.out.println("Digite a senha: ");
            senha = scan.next();

        }

    }
}
