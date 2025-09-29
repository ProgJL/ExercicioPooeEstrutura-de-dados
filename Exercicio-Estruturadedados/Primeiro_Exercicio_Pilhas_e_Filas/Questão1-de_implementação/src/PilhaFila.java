import java.util.LinkedList;
public class PilhaFila{
    static class Pilha{
        private LinkedList<Object> lista;
        public Pilha(){
            lista = new LinkedList<>();

        }
          public void empilhar(Object elemento){
            lista.push(elemento);
          }

          public Object desempilhar(){
             return lista.pop();
          }

    }
    static class Fila{
        private LinkedList<Object> lista;
        public Fila(){
            lista = new LinkedList<>();
        }
        public void enfileirar(Object elemento){
            lista.addLast(elemento);
        }
        public Object desenfileirar(){
            return lista.removeFirst();
        }
    }
}