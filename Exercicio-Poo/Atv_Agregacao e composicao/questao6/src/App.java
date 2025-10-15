// Nome: Jorge Augusto Melém da Silva Lima
// Turno:manhã
// curso:ADS
// Matricula:26159658

public class App {
    public static void main(String[] args) throws Exception {
        Professor prof1 = new Professor("Samara");
        Turma turma = new Turma("A1");
        turma.setProfessor(prof1);
        turma.resumo();  // Exibe: Código: A1, Professor: João

        Professor prof2 = new Professor("Alison");
        turma.setProfessor(prof2);
        
        turma.resumo();  // Exibe: Código: A1, Professor: Maria
    }
}
