package exercicios1;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        System.out.println("Sucessor: " + (numeroInteiro + 1));
        System.out.println("Antecessor: " + (numeroInteiro - 1));

        scanner.close();
    }
}
