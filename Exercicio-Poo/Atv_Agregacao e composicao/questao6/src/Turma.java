// Nome: Jorge Augusto Melém da Silva Lima
// Turno:manhã
// curso:ADS
// Matricula:26159658
public class Turma {
    private String codigo;
    private Professor professor;
    private boolean professorTrocado = false;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public void setProfessor(Professor p) {
        if (this.professor != null) {
            this.professorTrocado = true;
        } 
        this.professor = p;    
     }
        
    

    public void resumo() {
        if (professor != null) {
            String texto = "Código da turma: " + codigo + ", Professor: " + professor.getNome();
            if (professorTrocado){
                texto += " -> Professor trocado com sucesso!";
            }
            System.out.println(texto);
        } else{
            System.out.println("Código da turma: " + codigo + ", Sem professor atribuído.");
        }
            
        }
    }

