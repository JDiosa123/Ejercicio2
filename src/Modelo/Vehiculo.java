
package Modelo;


public abstract class Vehiculo {
    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidad);

    public void imprimir() {
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad Maxima: " + velocidadMaxima + " km/h");
    }
}