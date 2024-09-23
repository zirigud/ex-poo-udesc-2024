package exercicios1;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioTotal = salarioPorHora * horasTrabalhadas;
        System.out.println("Seu salário total no mês é: R$ " + salarioTotal);

        scanner.close();
    }
}
