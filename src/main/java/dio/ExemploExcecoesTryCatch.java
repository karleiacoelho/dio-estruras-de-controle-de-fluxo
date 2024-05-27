package dio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcecoesTryCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            // obtendo dados do usuário usando Scanner

            System.out.println("Digite seu nome");
            String nome = sc.next();
            System.out.println("Digite seu sobrenome");
            String sobrenome = sc.next();
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
            System.out.println("Digite sua altura");
            double altura = sc.nextDouble();

            // Imprimindo os dados
            System.out.println("Olé! Meu nome é: " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".");
            System.out.println("Eu tenho " + idade + " anos.");
            System.out.println("Minha altura é de " + altura + "cm");
            sc.close();
        }catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
