package Ejercicio2POO;

public class main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Audi R8", 2006, 330, 2);

        System.out.println(carro1.toString());

        Moto moto1 = new Moto("Honda CBR600RR", 2019, 270, false);
        System.out.println(moto1.toString());

        Carro carro2 = new Carro("Ford Raptor F-150", 2024, 260, 4);

        System.out.println(carro2.toString());

        Moto moto2 = new Moto("KAWASAKI ZH2", 2023, 300, false);
        System.out.println(moto2.toString());
    }
}