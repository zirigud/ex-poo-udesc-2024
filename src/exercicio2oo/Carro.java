package exercicio2oo; // Arthur Perret e Guilherme Pasold

public class Carro {
    private String Modelo;
    private double Velocidade;

    public Carro(String Modelo, double Velocidade) {
        this.Modelo = Modelo;
        this.Velocidade = Velocidade;
    }

    public double getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(double velocidade) {
        Velocidade = velocidade;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double Acelerar() {
        Velocidade += 40;
        System.out.println("\nACELEROUUUU\n");
        return Velocidade;
    }

    public double Frear() {
        Velocidade -= 40;
        System.out.println("\nFREIOUUUUU\n");
        return Velocidade;
    }

    public void imprimirDados() {
        System.out.println("Carro: " + getModelo());
        System.out.println("Velocidade: " + getVelocidade());
    }
}
