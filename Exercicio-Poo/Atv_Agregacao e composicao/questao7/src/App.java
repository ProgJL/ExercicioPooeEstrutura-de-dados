// Nome: Jorge Augusto Melém da Silva Lima
// Turno:manhã
// curso:ADS
// Matricula:26159658

public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Teclado", 2, 150.0);
        pedido.adicionarItem("Mouse", 1, 80.0);
        System.out.println();
        pedido.imprimirItens();
        System.out.printf("Valor total do pedido: %.2f%n " , pedido.valorTotal());
    }
}
