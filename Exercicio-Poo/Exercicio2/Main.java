package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setAno(2020);

        Carro carro2 = new Carro();
        carro2.setMarca("Honda");
        carro2.setAno(2018);

        System.out.println("Carro 1: " + carro1.getMarca() + ", Ano: " + carro1.getAno());
        System.out.println("Carro 2: " + carro2.getMarca() + ", Ano: " + carro2.getAno());
    }
}
