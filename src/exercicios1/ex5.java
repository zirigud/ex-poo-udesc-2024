package exercicios1;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomePessoa = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idadePessoa = scanner.nextInt();

        if (idadePessoa < 16) {
            System.out.println(nomePessoa + ", Não pode votar!");
        } else {
            System.out.println(nomePessoa + ", Apto a votar!");
        }

        scanner.close();
    }
}
