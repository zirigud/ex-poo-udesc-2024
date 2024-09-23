package exercicios1;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        int distanciaPercorrida = scanner.nextInt();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        int totalCombustivelGasto = scanner.nextInt();

        double mediaConsumo = (double) distanciaPercorrida / totalCombustivelGasto;
        System.out.println("Média de consumo: " + mediaConsumo + " km/l");

        scanner.close();
    }
}
