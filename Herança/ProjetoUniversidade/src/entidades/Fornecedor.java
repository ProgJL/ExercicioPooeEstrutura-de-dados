package entidades;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(){
        
    }

    // metodos set e get para o atributo valorCredito
    public double getValorCredito() {
        return valorCredito;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    // metodos set e get para o atributo valorDivida
    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double ObterSaldo(){
        return valorCredito - valorDivida;
    }

    public void printarInformacoesFornecedor(){
        PrintarInformacoes();
        System.out.println("Valor do Crédito: R$" + this.getValorCredito());
        System.out.println("Valor da Dívida: R$" + this.getValorDivida());
        System.out.println("Saldo: R$" + this.ObterSaldo());
    }
}
