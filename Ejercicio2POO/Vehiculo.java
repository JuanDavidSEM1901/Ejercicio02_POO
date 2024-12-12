package Ejercicio2POO;

public class Vehiculo {
    // atributos
    public String marca;
    public int modelo;
    public int velocidadMaxima;

    // metodo contructor vacio
    public Vehiculo(){

    }
    // CONSTRUCTOR
    public Vehiculo(String marca, int modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // getter and setters

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", velocidadMaxima=" + velocidadMaxima + " ]";
    }
    
    

    
    

    

    
}
