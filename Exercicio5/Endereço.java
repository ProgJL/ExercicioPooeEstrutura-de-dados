package Exercicio5;

public class Endereço {
    private String rua;
    private int numero;

    // Construtor
    public Endereço(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    // Métodos getters
    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }
}
