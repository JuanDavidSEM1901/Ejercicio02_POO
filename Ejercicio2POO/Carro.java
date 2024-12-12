package Ejercicio2POO;

public class Carro extends Vehiculo {
    public int numPuertas;

    public Carro(){

    }

    public Carro(String marca, int modelo, int velocidadMaxima, int numPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Carro [numPuertas=" + numPuertas + ", marca=" + marca + ", modelo=" + modelo + ", velocidadMaxima="
                + velocidadMaxima + "]";
    }

    

    
}
