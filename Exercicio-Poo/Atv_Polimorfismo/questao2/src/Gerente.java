public class Gerente extends Funcionario {
    protected double bonus;

    public Gerente(String nome, String cpf, double bonus) {
        super(nome, cpf);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }
}
