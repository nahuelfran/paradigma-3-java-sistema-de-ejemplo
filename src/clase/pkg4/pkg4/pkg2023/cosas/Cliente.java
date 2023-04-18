/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg4.pkg4.pkg2023.cosas;

import java.util.ArrayList;

/**
 *
 * @author Nahuel
 */
public class Cliente extends Persona implements ICompra {
    private int numeroCliente;
    private Seguro seguro;
    private ArrayList<Tarjeta> tarjetas;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String nombre, String apellido, int dni, int numeroCliente, Seguro seguro) {
        super(nombre, apellido, dni);
        this.numeroCliente = numeroCliente;
        this.seguro = seguro;
        this.tarjetas = new ArrayList<>();
        this.cuentas =new ArrayList<>() ;
    }
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
     // Método comprar que implementa la interfaz ICompra
    public void comprar(Cuenta cuenta, Tarjeta tarjeta) {
    // Lógica para realizar una compra usando una cuenta y una tarjeta
  }
    
    
    
    
}
