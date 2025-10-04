package entidades;
public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    public Aluno(){

    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    // metodos set e get para o atributo matricula
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // metodos set e get para o atributo curso
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void CancelarMatricula(){
        System.out.println("Matrícula cancelada com sucesso!");
    }

    // no brasil a maioridade é de 18 anos
    // porém a pessoa apartir dos 16 anos já pode votar

    public void verificarMaioridade(){
        if(this.idade >= 16 && this.idade < 18){
            System.out.println(nome+", você é menor de idade, porém pode votar!");
        } else if(this.idade >= 18){
            System.out.println(nome+", Você é maior de idade e pode votar!");
        } else{
            System.out.println(nome+", Você é menor de idade e não pode votar!");
        }
    }

    public void PrintarInformacoesAluno(){
        PrintarInformacoes();
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
    }
}