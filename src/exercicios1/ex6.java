package exercicios1;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idadeDoacao = scanner.nextInt();

        if (idadeDoacao >= 18 && idadeDoacao <= 67) {
            System.out.println("Você pode doar sangue.");
        } else {
            System.out.println("Você não pode doar sangue.");
        }

        scanner.close();
    }
}
