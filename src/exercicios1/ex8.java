package exercicios1;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        int maiorValor = primeiroNumero;
        int menorValor = primeiroNumero;

        for (int i = 1; i < 4; i++) {
            System.out.print("Digite o próximo número: ");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado > maiorValor) {
                maiorValor = numeroDigitado;
            }

            if (numeroDigitado < menorValor) {
                menorValor = numeroDigitado;
            }
        }

        System.out.println("Maior: " + maiorValor);
        System.out.println("Menor: " + menorValor);

        scanner.close();
    }
}
