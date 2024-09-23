package exercicios1;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double mediaNotas = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + mediaNotas);

        if (mediaNotas >= 7) {
            System.out.println(nomeAluno + ", Aprovado!");
        } else if (mediaNotas >= 5) {
            System.out.println(nomeAluno + ", Em exame.");
        } else {
            System.out.println(nomeAluno + ", Reprovado.");
        }

        scanner.close();
    }
}
