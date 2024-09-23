package exercicios2; // Arthur Perret e Guilherme Pasold

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = sc.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = sc.nextFloat();

        double media = (num1 + num2) / 2.0;

        System.out.printf("Os números %.2f e %.2f têm a média aritmética de %.2f%n", num1, num2, media);
    }
}
