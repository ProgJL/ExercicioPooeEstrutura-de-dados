package principal;

import entidades.Aluno;
import entidades.Fornecedor;
import entidades.Funcionario;
import entidades.Professor;

public class App {
    static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pularLinha() {
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) throws Exception {
        limparTela();
        System.out.println("Projeto Escola");
        Aluno a1 = new Aluno();
        // configurando os atributos herdáveis pela classe Pessoa
        System.out.println("Aluno 1");
        a1.setNome("Pedro");
        a1.setIdade(23);
        a1.setSexo("Masculino");
        a1.setEndereco("Rua maria de Fátima , 57");
        a1.setTelefone("(91) 9 99451-7474");

        // configurando os atributos específicos da classe Aluno
        a1.setCurso("Engenharia Ferroviária");
        a1.setMatricula("20230012345");
        
        a1.PrintarInformacoesAluno();
        a1.verificarMaioridade();

        pularLinha();
        pularLinha();
        Aluno a2 = new Aluno("Ana", 17);
        // configurando os atributos herdáveis pela classe Pessoa
        a2.setSexo("Feminino");
        a2.setEndereco("Rua das Flores, 123");
        a2.setTelefone("(91) 9 91234-5678");
        // configurando os atributos específicos da classe Aluno
        a2.setCurso("Medicina");
        a2.setMatricula("20230054321");
        System.out.println("Aluno 2");
        a2.PrintarInformacoesAluno();
        a2.verificarMaioridade();

        pularLinha();
        pularLinha();
        
        Aluno a3 = new Aluno("Bia", 15, "(91) 9 97654-3210");
        // configurando os atributos herdáveis pela classe Pessoa
        a3.setSexo("Feminino");
        a3.setEndereco("Av. Brasil, 456");
        
        // configurando os atributos específicos da classe Aluno
        a3.setCurso("Direito");
        a3.setMatricula("20230067890");
        
        System.out.println("Aluno 3");
        a3.PrintarInformacoesAluno();
        a3.verificarMaioridade(); // o aluno tem 15 anos e é menor de idade
        a3.FazerAniversario(); // o aluno faz aniversário e fica com 16 anos
        a3.verificarMaioridade(); // o aluno agora tem 16 anos e pode votar
        pularLinha();

        // pegar a matricula do aluno 2
        System.out.println("Matrícula do aluno 2: " + a2.getMatricula());
        a2.CancelarMatricula();

        pularLinha();
        pularLinha();
        Professor p1 = new Professor();
        // configurando os atributos herdáveis pela Professor
        p1.setNome("Carlos");
        p1.setIdade(45);
        p1.setSexo("Masculino");
        p1.setEndereco("Rua dos Professores, 789");
        p1.setTelefone("(91) 9 99876-5432");

        // configurando os atributos específicos da classe Professor
        p1.setEspecialidade("Matemática");
        p1.setSalario(5000.00);
        p1.PrintarInformacoesProfessor();
        p1.FazerAniversario(); // o professor faz aniversário e fica com 46 anos
        p1.ReceberAumento(500.00);

        pularLinha();
        pularLinha();
        Funcionario f1 = new Funcionario();
        // configurando os atributos herdáveis pela classe Pessoa
        f1.setNome("Mariana");
        f1.setIdade(30);
        f1.setSexo("Feminino");
        f1.setEndereco("Av. Central, 101");
        f1.setTelefone("(91) 9 98765-4321");

        // configurando os atributos específicos da classe Funcionario
        f1.setSetor("Secretaria");
        f1.setTrabalhando(true);
        f1.printarInformacoesFuncionario();
        f1.mudarTrabalho(); // a funcionária para de trabalhar

        pularLinha();
        pularLinha();
        Fornecedor fr1 = new Fornecedor();
        // configurando os atributos herdáveis pela classe Pessoa
        fr1.setNome("Loja de Material Escolar");
        fr1.setIdade(10); // idade da empresa em anos
        fr1.setSexo("N/A");
        fr1.setEndereco("Rua do Comércio, 202");
        fr1.setTelefone("(91) 9 91234-5678");

        // configurando os atributos específicos da classe Fornecedor
        fr1.setValorCredito(10000.00);
        fr1.setValorDivida(3500.00);
        fr1.printarInformacoesFornecedor();
        System.out.println("Saldo do Fornecedor: R$" + fr1.ObterSaldo());
    }
}
