package exercicios1;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite M para masculino ou F para feminino: ");
        char sexoPessoa = scanner.next().charAt(0);

        if (sexoPessoa == 'M' || sexoPessoa == 'm') {
            System.out.println("Sexo: Masculino");
        } else if (sexoPessoa == 'F' || sexoPessoa == 'f') {
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Sexo inválido!");
        }

        scanner.close();
    }
}
