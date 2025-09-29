public class Fila {
    private int[] array;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.array = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void enqueue(int valor) {
        if (tamanho < capacidade) {
            fim = (fim + 1) % capacidade;
            array[fim] = valor;
            tamanho++;
        }
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1; // ou lançar exceção
        }
        int valor = array[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            return -1; // ou lançar exceção
        }
        return array[inicio];
    }

    
}