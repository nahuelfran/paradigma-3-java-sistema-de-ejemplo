/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg4.pkg4.pkg2023;


import clase.pkg4.pkg4.pkg2023.cosas.Area;
import clase.pkg4.pkg4.pkg2023.cosas.Cliente;
import clase.pkg4.pkg4.pkg2023.cosas.Cuenta;
import clase.pkg4.pkg4.pkg2023.cosas.Direccion;
import clase.pkg4.pkg4.pkg2023.cosas.Empleado;
import clase.pkg4.pkg4.pkg2023.cosas.Seguro;
import clase.pkg4.pkg4.pkg2023.cosas.Tarjeta;


/**
 *
 * @author Nahuel
 */
public class Clase442023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Av. Libertador", 1234, "la Rioja");
        Direccion direccion2 = new Direccion("Malvinas", 4321, "la Rioja");
        
        Area area1 = new Area("Ventas", "Vender productos y servicios");
        Empleado empleado1 = new Empleado("Mirtha", "Vargas", 87654321,12312,10,area1);
        empleado1.getDireccione().add(direccion1);
        
        System.out.println("Empleado: " + empleado1.getNombre() + " " + empleado1.getApellido());
        System.out.println("Dirección: " + direccion1.getNombreCalle() + " " + direccion1.getNumero() + ", " + direccion1.getCiudad());
        System.out.println("Área: " + area1.getNombre() + " - Descripción: " + area1.getDescripcion());
        
        Seguro seguro1 = new Seguro("Vida", 10000);
        Cliente cliente1 = new Cliente("Nahuel","Gonzalez",7237823,12,seguro1);
        
        Tarjeta tarjeta1 = new Tarjeta("Crédito", 5000, cliente1);
        Cuenta cuenta1 = new Cuenta("Ahorro", 10000, cliente1);
        
        cliente1.getDireccione().add(direccion2);
        cliente1.getTarjetas().add(tarjeta1);
        cliente1.getCuentas().add(cuenta1);
        
        System.out.println("Cliente: " + cliente1.getNombre() + " " + cliente1.getApellido());
        System.out.println("Dirección: " + direccion2.getNombreCalle() + " " + direccion2.getNumero() + ", " + direccion2.getCiudad()); 
        System.out.println("Tarjeta: " + tarjeta1.getTipo() + " - Saldo: " + tarjeta1.getSaldoCompra());
        System.out.println("Cuenta: " + cuenta1.getTipo() + " - Saldo: " + cuenta1.getSaldo());
        
    }
    
}

