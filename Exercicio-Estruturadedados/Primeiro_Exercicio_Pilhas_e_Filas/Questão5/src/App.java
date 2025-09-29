public class App {
    public static void main(String[] args) throws Exception {
        
        
        Fila fila = new Fila(5);
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        
        System.out.println("Primeiro elemento: " + fila.peek());
        
        System.out.println("Removendo elementos:");
        while (!fila.isEmpty()) {
            System.out.println(fila.dequeue());
        }



    
    }
}
