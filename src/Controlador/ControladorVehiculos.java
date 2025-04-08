package Controlador;
import Modelo.*;

public class ControladorVehiculos {
     public void probarVehiculos() {
         
        Terrestre camioneta = new Terrestre(180, 90, 4, "civil"); 
        Acuatico motoAcuatica  = new Acuatico(180, 60, 4, "superficie");

        System.out.println("Camioneta:");
        camioneta.acelerar(50);
        camioneta.acelerar(100);
        camioneta.frenar(30);
        camioneta.imprimir();
        System.out.println("Revoluciones del motor: " + camioneta.calcularRevolucionesMotor(10, 5));

        System.out.println("\nMoto de agua:");
        motoAcuatica.acelerar(60);
        motoAcuatica.recomendarVelocidad(83);
        motoAcuatica.imprimir();
        motoAcuatica.recomendarVelocidad(7);
        motoAcuatica.recomendarVelocidad(50);
      
    }
}
