// Nome: Jorge Augusto Melém da Silva Lima
// Turno:manhã
// curso:ADS
// Matricula:26159658
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            
            String input1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
            if (input1 == null) return;
            double num1 = Double.parseDouble(input1);

            String input2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
            if (input2 == null) return;
            double num2 = Double.parseDouble(input2);

            Calculadora calc = new Calculadora(num1, num2);

            
            String[] opcoes = { "+", "-", "x", "dividir" };
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha a operaçao:",
                    "Calculadora Simples ",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            if (escolha == JOptionPane.CLOSED_OPTION) return;

            double resultado = 0;
            String operacao = opcoes[escolha];

            switch (operacao) {
                case "+":
                    resultado = calc.somar();
                    break;
                case "-":
                    resultado = calc.subtrair();
                    break;
                case "x":
                    resultado = calc.multiplicar();
                    break;
                case "dividir":
                    resultado = calc.dividir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida!");
                    return;
            }

            JOptionPane.showMessageDialog(null,
                    "Resultado: " + num1 + " " + operacao + " " + num2 + " = " + resultado,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas numeros validos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
}
