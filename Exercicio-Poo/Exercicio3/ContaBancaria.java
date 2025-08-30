package Exercicio3;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;



    public ContaBancaria(int numeroConta, double saldoConta){
        this.numeroConta = numeroConta;
        this.saldo = saldoConta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        saldo += valor; 
    }
    
    public void sacar(double valor){
        if(saldo>=valor){
            saldo -= valor; 
        }
        else{
            System.out.println("Voce não possui saldo suficiente!");
        }
    }

    

    
}
