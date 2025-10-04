package entidades;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(){

    }

    public void ReceberAumento(double aumento){
        this.salario += aumento;
        System.out.println("Salário atualizado! Novo salário: R$" + this.salario);
    }

    // metodos set e get para o atributo especialidade
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // metodos set e get para o atributo salario
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void PrintarInformacoesProfessor(){
        PrintarInformacoes();
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salário: R$" + this.getSalario());
    }
    
    
}
