package exercicio2oo; // Arthur Perret e Guilherme Pasold

public class Aluno {

    private String nome;
    private int idade;
    private int nota1;
    private int nota2;

    public Aluno(String nome, int idade, int nota1, int nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2.0;
    }

    public String verificarSituacao() {
        if (calcularMedia() >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota1() {
        return this.nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return this.nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
}
