

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
    }


    public String getTitulo() {
        return this.titulo;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro '" + this.titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("Livro '" + this.titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("Livro '" + this.titulo + "' devolvido com sucesso.");
        } else {
            System.out.println("Livro '" + this.titulo + "' já está disponível.");
        }
    }
    
    public void exibirInfo() {
        String status = this.disponivel ? "Disponível" : "Emprestado";
        System.out.println("Título: " + this.titulo + " | Autor: " + this.autor + " | Status: " + status);
    }
}
