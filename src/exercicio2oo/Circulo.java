package exercicio2oo; // Arthur Perret e Guilherme Pasold

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularDiametro() {
        return 2 * this.raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    public void imprimirDados() {
        System.out.println("Diâmetro: " + calcularDiametro());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
