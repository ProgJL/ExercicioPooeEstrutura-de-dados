package exercicio4;
public class Produto{
    private String nome;
    private double preco;
    
    public Produto(){
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        if (preco > 0){
           this.preco = preco; 
        }else{
            System.out.println("o valor nao pode ser menor do que zero");
        } 
    }
}