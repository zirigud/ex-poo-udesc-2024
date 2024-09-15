package exercicio2oo; // Arthur Perret e Guilherme Pasold

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
        }
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
