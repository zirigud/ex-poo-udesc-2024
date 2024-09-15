package exercicio2oo; // Arthur Perret e Guilherme Pasold

public class TestaContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("12345");


        System.out.println("Saldo inicial: " + conta.verificarSaldo());


        conta.depositar(100.0);
        System.out.println("Saldo após depósito de 100: " + conta.verificarSaldo());


        conta.sacar(50.0);
        System.out.println("Saldo após saque de 50: " + conta.verificarSaldo());


        conta.sacar(100.0);
        System.out.println("Saldo após tentativa de saque de 100: " + conta.verificarSaldo());


        conta.depositar(-20.0);
        System.out.println("Saldo após tentativa de depósito negativo: " + conta.verificarSaldo());
    }


}
