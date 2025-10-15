// Nome: Jorge Augusto Melém da Silva Lima
// Turno:manhã
// curso:ADS
// Matricula:26159658

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    static class ItemPedido {
        private String nome;
        private int quantidade;
        private double preco;
        
        public ItemPedido(String nome, int quantidade, double preco) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco = preco;
        }
        
        public double getSubtotal() {
            return quantidade * preco;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getPreco() {
            return preco;
        }
    }
    
    private List<ItemPedido> itens = new ArrayList<>();
    
    public void adicionarItem(String nome, int quantidade, double preco) {
        itens.add(new ItemPedido(nome, quantidade, preco));
    }
    
    public double valorTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void imprimirItens(){
        for(ItemPedido item : itens){
            System.out.printf("%s - Quantidade: %d - Preço: %.2f -> subtotal: %.2f%n", item.getNome(), item.getQuantidade(), item.getPreco(), item.getSubtotal());
        }
    }
}