public class App {
    public static void main(String[] args) throws Exception {
        Funcionario[] listaDePagamentos = new Funcionario[2];
        listaDePagamentos[0] = new Gerente ("Fernando Soares","812.897.548-99",500.00);
        listaDePagamentos[1] = new Programador ("Jorge Lima","123.456.789-00");

        System.out.println("Cálculo de Salários:");

        for(Funcionario funcionario : listaDePagamentos){
            if (funcionario instanceof Gerente) {
                System.out.println("Gerente: " + funcionario.nome + " - Salário: R$ " + funcionario.calcularSalario());
                
            } else {
                System.out.println("Programador: " + funcionario.nome + " - Salário: R$ " + funcionario.calcularSalario());
            }
        }
    }
}
