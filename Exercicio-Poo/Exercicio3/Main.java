package Exercicio3;

public class Main {
    public static void main(String[] args) {
	    
	    ContaBancaria conta1 = new ContaBancaria(2054, 65.00);
	    
	    double saldo1 = conta1.getSaldo();
		System.out.println("Saldo Inicial: R$ "+saldo1);
		
		conta1.depositar(200.0); 
		
		double saldo2 = conta1.getSaldo();
		System.out.println("Saldo Atual: R$ "+saldo2);
		
		conta1.sacar(90.00); 
		
		double saldo3 = conta1.getSaldo();
		System.out.printf("Saldo Atual: R$ %.2f\n",saldo3);
	}
}
