package exercicio1oo; // Arthur Perret e Guilherme Pasold

public class Retangulo {

    private double area;
    private double altura;


    public Retangulo(double area, double altura) {
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
        double calculo = area * altura;
        return calculo;
    }


    //





}
