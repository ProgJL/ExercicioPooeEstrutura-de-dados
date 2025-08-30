package exercicio4;
public class Main{
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.setNome("Celular");
		produto1.setPreco(2500.0);
		
		String nome1 = produto1.getNome();
		System.out.println("nome do produto é "+nome1);
		
		double preco1 = produto1.getPreco();
		System.out.println("O preco do produto é "+preco1);
		
		
		
		
		
		Produto produto2 = new Produto();
		produto2.setNome("Mochila");
		produto2.setPreco(900.0);
		
		nome1 = produto2.getNome();
		System.out.println("nome do produto é "+nome1);
		
		preco1 = produto2.getPreco();
		System.out.println("O preco do produto é "+preco1);
		
		
		
	}
}
