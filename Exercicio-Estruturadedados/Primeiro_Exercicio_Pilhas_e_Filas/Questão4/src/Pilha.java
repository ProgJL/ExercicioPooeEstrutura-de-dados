public class Pilha {
    private int[] inteiros;
    private int topo;
    private int capacidade;


    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.inteiros = new int[capacidade];
        this.topo = -1;

        }
        public void push(int valor){
            if (topo < capacidade - 1) {
                inteiros[++topo] = valor;
            } else {
                System.out.println("Pilha cheia!");
            }
        }
        public int pop(){
            if (isEmpty()) {
                System.out.println("Pilha vazia!");
                return -1;
            }
            return inteiros[topo--];
        }
        public boolean isEmpty(){
            return topo == -1;
    }
    public int peek(){
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return inteiros[topo];
    }
}

        
