public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();
        
        
        System.out.println("Soma de dois inteiros: " + calc.somar(5, 3));  
        
        
        System.out.println("Soma de três inteiros: " + calc.somar(5, 3, 2));  
        
        
        System.out.println("Soma de dois doubles: " + calc.somar(5.5, 3.2));  
    
    }
}
