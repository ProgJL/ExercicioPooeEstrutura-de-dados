 

public class Biblioteca {
    private Livro[] vetorDeLivros;
    private int contLivros;

    public Biblioteca(int capacidade) {
        this.vetorDeLivros = new Livro[capacidade];
        this.contLivros = 0;
    }
    public void adicionarLivro(Livro livro) {
        if (this.contLivros < this.vetorDeLivros.length) {
            this.vetorDeLivros[this.contLivros] = livro;
            this.contLivros++;
            System.out.println("Livro '" + livro.getTitulo() + "' adicionado à biblioteca.");
        } else {
            System.out.println("A biblioteca está cheia. Não é possível adicionar mais livros.");
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < this.contLivros; i++) {
            if (this.vetorDeLivros[i].getTitulo().equalsIgnoreCase(titulo)) {
                this.vetorDeLivros[i].emprestar();
                return;
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i < this.contLivros; i++) {
            if (this.vetorDeLivros[i].getTitulo().equalsIgnoreCase(titulo)) {
                this.vetorDeLivros[i].devolver();
                return;
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado.");
    }
    public void mostrarLivros() {
        System.out.println("\n--- Livros na Biblioteca ---");
        if (this.contLivros == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < this.contLivros; i++) {
                this.vetorDeLivros[i].exibirInfo();
            }
        }
        System.out.println("----------------------------\n");
    }
}
