package Exercicio5;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereço endereco;

    // Construtor
    public Pessoa(String nome, int idade, Endereço endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método para mostrar dados
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero());
    }
}


