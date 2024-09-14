package exercicio1oo; // Arthur Perret e Guilherme Pasold


public class Carro {
    public String Modelo;
    public double Velocidade;


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


    double Acelerar() {
        Velocidade = this.Velocidade + 40;
        System.out.println("");
        System.out.println("ACELEROUUUU\n");
        return Velocidade;
    }


    double Frear (){
        Velocidade = this.Velocidade - 40;
        System.out.println("");
        System.out.println("FREIOUUUUU\n");
        return Velocidade;
    }


    void imprimirDados() {
        System.out.println("Carro: " + getModelo());
        System.out.println("Velocidade: " + getVelocidade());
    }
}
