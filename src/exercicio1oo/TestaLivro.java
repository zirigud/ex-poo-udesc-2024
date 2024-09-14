package exercicio1oo; // Arthur Perret e Guilherme Pasold

public class TestaLivro {

    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        System.out.println("Disponibilidade inicial: " + (livro.isDisponivel() ? "Disponível" : "Não disponível"));
        livro.emprestar();
        System.out.println("Disponibilidade após emprestar: " + (livro.isDisponivel() ? "Disponível" : "Não disponível"));
        livro.devolver();
        System.out.println("Disponibilidade após devolver: " + (livro.isDisponivel() ? "Disponível" : "Não disponível"));
    }

}
