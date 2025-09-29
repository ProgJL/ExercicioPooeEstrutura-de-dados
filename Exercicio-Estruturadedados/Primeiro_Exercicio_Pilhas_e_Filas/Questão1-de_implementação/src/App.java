

public class App {
    public static void main(String[] args) throws Exception {
        PilhaFila.Pilha p1 = new PilhaFila.Pilha();
                

        p1.empilhar(10);
        System.out.println("Pilha");
        System.out.println(p1.desempilhar());
        System.out.println("---------");
        System.out.println();

        p1.empilhar(10);

        p1.empilhar(20);
                System.out.println(p1.desempilhar());
                System.out.println(p1.desempilhar());


                PilhaFila.Fila f1 = new PilhaFila.Fila();

                f1.enfileirar(10);
                System.out.println("---------");

                System.out.println("Fila");
                System.out.println(f1.desenfileirar());
                System.out.println("---------");
                System.out.println();

                f1.enfileirar(10);
                f1.enfileirar(20);
                System.out.println(f1.desenfileirar());
                System.out.println(f1.desenfileirar());


        
    }
}
