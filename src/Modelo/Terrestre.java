
package Modelo;

public class Terrestre extends Vehiculo implements Motor {
    private int cantidadLlantas;
    private String uso;

    public Terrestre(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String uso) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
    }

   
    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public void acelerar(int velocidad) {
        int nuevaVelocidad = velocidadActual + velocidad;
        if (nuevaVelocidad > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        } else {
            velocidadActual = nuevaVelocidad;
        }
    }

    @Override
    public void frenar(int velocidad) {
        int nuevaVelocidad = velocidadActual - velocidad;
        if (nuevaVelocidad < 0) {
            velocidadActual = 0;
        } else {
            velocidadActual = nuevaVelocidad;
        }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}