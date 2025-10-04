package entidades;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(){

    }

    // metodos set e get para o atributo setor
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    // metodos set e get para o atributo trabalhando
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){
        if(this.isTrabalhando() == true){
            this.setTrabalhando(false);
            System.out.println("O funcionário parou de trabalhar.");
        } else {
            this.setTrabalhando(true);
            System.out.println("O funcionário começou a trabalhar.");
        }
    }
    
    public void printarInformacoesFuncionario(){
        PrintarInformacoes();
        System.out.println("Setor: " + this.getSetor());
        if(this.isTrabalhando() == true){
            System.out.println("O funcionário está trabalhando.");
        } else {
            System.out.println("O funcionário não está trabalhando.");
        }
    }
}
