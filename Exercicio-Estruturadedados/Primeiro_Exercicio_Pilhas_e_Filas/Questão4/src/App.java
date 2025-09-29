public class App {
    public static void main(String[] args) throws Exception {
        Pilha p1 = new Pilha(5);
        p1.push(10);
        p1.push(20);
        p1.push(30);

        System.out.println("Elemento no topo: " + p1.peek()); // Deve imprimir 30
        System.out.println();
        System.out.println("Removendo elemento");

        while (!p1.isEmpty()) {
            System.out.println("Elemento removido: " + p1.pop());
        }
    }
}
