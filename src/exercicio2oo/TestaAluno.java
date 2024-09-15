package exercicio2oo; // Arthur Perret e Guilherme Pasold

public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, 8, 5);
        double media = aluno.calcularMedia();
        System.out.println("Média: " + media);
        String situacao = aluno.verificarSituacao();
        System.out.println("Situação: " + situacao);
    }
}
