
package Modelo;

public class Acuatico extends Vehiculo implements Vela{
    
    public int capacidadPasajeros;
    public String tipo;
    
    public Acuatico(int velocidadActual, int velocidadMaxima, int capacidadPasajeros, String tipo){
    super(velocidadActual, velocidadMaxima);
    this.capacidadPasajeros=capacidadPasajeros;
    this.tipo=tipo;

    }
    public int getcapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setcapacidadPasajeros(int capacidad) {
        this.capacidadPasajeros = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    public int recomendarVelocidad(int fuerza, int radio) {
        return fuerza * radio;
    }
    
    @Override
    public void recomendarVelocidad(int velocidadViento){
    if(velocidadViento>80) {
        System.out.println("El viento es  muy fuerte, se recomienda NO salir a navegar: ");
        velocidadActual=0;
    }else if(velocidadViento<10) {
        System.out.println("El viento es  muy bajo, se recomienda NO salir a navegar: ");
    }else{
        System.out.println("El viento es  adecuado, se recomienda salir a navegar: ");
    }
}
}
