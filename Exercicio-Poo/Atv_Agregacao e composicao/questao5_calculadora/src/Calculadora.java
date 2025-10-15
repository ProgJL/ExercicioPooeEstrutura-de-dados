// Nome: Jorge Augusto Melém da Silva Lima
// Turno:manhã
// curso:ADS
// Matricula:26159658
public class Calculadora {
    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double somar() {
        return numero1 + numero2;
    }

    public double subtrair() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisao por zero não e permitida.");
        }
        return numero1 / numero2;
    }

}
