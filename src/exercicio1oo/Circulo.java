package exercicio1oo; // Arthur Perret e Guilherme Pasold

public class Circulo {
    public double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }


    public double getRaio() {
        return raio;
    }


    public void setRaio(double raio) {
        this.raio = raio;
    }


    public double calculardiametro(){
        double diametro = 2 * this.raio;
        return diametro;
    }


    public double calcularArea(){
        double area = Math.PI * Math.pow(this.raio,2);
        return area;
    }


    public double calcularPerimetro(){
        double perimetro = 2 * Math.PI * this.raio;
        return perimetro;
    }






    void imprimirDados() {
        System.out.println("Diametro: " + calculardiametro());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

}
