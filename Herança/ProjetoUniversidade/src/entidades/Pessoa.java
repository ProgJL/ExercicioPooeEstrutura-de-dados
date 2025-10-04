package entidades;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected String endereco;
    protected String telefone;

    public void FazerAniversario() {
        this.idade++;
        System.out.println("Parabéns! Você agora tem " + this.idade + " anos.");
    }

    // metodos set e get para o atributo nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // metodos set e get para o atributo idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // metodos set e get para o atributo sexo
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // metodos set e get para o atributo endereco
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // metodos set e get para o atributo telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa(){

    }

    protected void PrintarInformacoes(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
    }
  
}
