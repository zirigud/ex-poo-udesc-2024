package exercicios2; // Arthur Perret e Guilherme Pasold
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex3 {
        public static void main(String[] args) {
            int Byte = 8;
            long Bits;
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o numero de bytes");
            Bits = sc.nextLong();



            if (Bits < 0 || Bits > Long.MAX_VALUE) {
                System.out.println("Digite um número Válido!");
            }

            // Verifica se o número de bits é múltiplo de 8
            if (Bits % Byte != 0) {
               System.out.println("Digite um Multiplo de 8");
            } else {
                // Faz a conversão de bits para bytes
                long bytes = Bits * Byte;
                String resultado = String.format("%d bytes correspondem a %d bits.", Bits, bytes);
                System.out.println(resultado);
            }
        }
    }


