package exercicio1oo; // Arthur Perret e Guilherme Pasold

public class TestaCarro {
    public static void main( String[] arg) {

        Carro carro = new Carro("Uno", 60.7);


        carro.imprimirDados();


        carro.Frear();
        carro.imprimirDados();


        carro.Acelerar();
        carro.imprimirDados();


        carro.Acelerar();
        carro.imprimirDados();


    }


}
