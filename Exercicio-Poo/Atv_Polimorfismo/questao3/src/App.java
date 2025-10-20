public class App {
    public static void main(String[] args) throws Exception {
        Funcionario dev = new Desenvolvedor(1500.00);
        Funcionario sup = new Suporte(1500.00);

        System.out.println(String.format("Salário Final Desenvolvedor: R$ %.2f", dev.calcularSalarioFinal()));
        System.out.println(String.format("Salário Final Suporte: R$ %.2f", sup.calcularSalarioFinal()));
    }
}
