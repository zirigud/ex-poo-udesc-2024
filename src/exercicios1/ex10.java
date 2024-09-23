package exercicios1;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de anos que fuma: ");
        int anosFumando = scanner.nextInt();

        System.out.print("Digite o número de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Digite o preço de uma carteira de cigarros: ");
        double precoCarteira = scanner.nextDouble();

        int cigarrosPorCarteira = 20;
        int totalCigarros = anosFumando * 365 * cigarrosPorDia;
        double totalGasto = (totalCigarros / cigarrosPorCarteira) * precoCarteira;

        System.out.printf("Total gasto com cigarros: R$ %.2f%n", totalGasto);

        scanner.close();
    }
}
