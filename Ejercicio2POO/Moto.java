package Ejercicio2POO;

public class Moto extends Vehiculo {
    public boolean sideCar;

    public Moto(){

    }

    public Moto(String marca, int modelo, int velocidadMaxima, boolean sideCar) {
        super(marca, modelo, velocidadMaxima);
        this.sideCar = sideCar;
    }

    @Override
    public String toString() {
        return "Moto [sideCar=" + sideCar + ", marca=" + marca + ", modelo=" + modelo + ", velocidadMaxima="
                + velocidadMaxima + "]";
    }

    
}
