/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg4.pkg4.pkg2023.cosas;

/**
 *
 * @author Nahuel
 */
public class Tarjeta{
    private String tipo;
    private double saldoCompra;
    private Cliente titular;

    public Tarjeta(String tipo, double saldoCompra, Cliente titular) {
        this.tipo = tipo;
        this.saldoCompra = saldoCompra;
        this.titular = titular;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoCompra() {
        return saldoCompra;
    }

    public void setSaldoCompra(double saldoCompra) {
        this.saldoCompra = saldoCompra;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
