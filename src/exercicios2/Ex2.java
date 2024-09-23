package exercicios2;// Arthur Perret e Guilherme Pasold
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Digite a Primeira nota:");
        if (n1 == null || n1.isEmpty()) {
            System.exit(0);
        }
        String n2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        if (n2 == null || n2.isEmpty()) {
            System.exit(0);
        }

        double nota1 = Double.parseDouble(n1);
        double nota2 = Double.parseDouble(n2);
        double media = (nota1 + nota2) / 2;
        String resultado = String.format("A média das notas é: %.2f", media);

        JOptionPane.showMessageDialog(null, resultado);

    }
}
