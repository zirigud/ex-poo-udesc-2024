package exercicio2oo; // Arthur Perret e Guilherme Pasold

public class Retangulo {

    private double area;
    private double altura;

    public Retangulo(double altura, double area) {
        this.altura = altura;
        this.area = area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calcular() {
        return area * altura;
    }
}
