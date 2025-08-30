package Exercicio5;

public class Main {
    public static void main(String[] args) {
        // Criando dois objetos Endereco
        Endereço endereco1 = new Endereço("Rua A", 10);
        Endereço endereco2 = new Endereço("Rua B", 20);

        // Criando duas pessoas, cada uma com seu endereço
        Pessoa pessoa1 = new Pessoa("João", 25, endereco1);
        Pessoa pessoa2 = new Pessoa("Maria", 30, endereco2);

        // Mostrando os dados de cada pessoa
        System.out.println("Dados da Pessoa 1:");
        pessoa1.mostrarDados();
        System.out.println();

        System.out.println("Dados da Pessoa 2:");
        pessoa2.mostrarDados();
    }
}
