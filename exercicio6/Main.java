

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca(5);

        // 2. Adicione pelo menos 3 livros
        Livro livro1 = new Livro("Reis", "Record1");
        Livro livro2 = new Livro("Reis a Sucessão", "Record2");
        Livro livro3 = new Livro("Reis o pecado", "Record4");
        Livro livro4 = new Livro("Reis a consequencia", "Record3");

        minhaBiblioteca.adicionarLivro(livro1);
        minhaBiblioteca.adicionarLivro(livro2);
        minhaBiblioteca.adicionarLivro(livro3);
        minhaBiblioteca.adicionarLivro(livro4);

        minhaBiblioteca.mostrarLivros();

        minhaBiblioteca.emprestarLivro("Reis");

        minhaBiblioteca.mostrarLivros();
        
        minhaBiblioteca.devolverLivro("Reis");

        minhaBiblioteca.mostrarLivros();
    }
}
