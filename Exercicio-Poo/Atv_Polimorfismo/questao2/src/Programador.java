public class Programador extends Funcionario {

    public Programador(String nome, String cpf) {
        super(nome, cpf);
    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (super.calcularSalario() * 0.20);
    }
    
}