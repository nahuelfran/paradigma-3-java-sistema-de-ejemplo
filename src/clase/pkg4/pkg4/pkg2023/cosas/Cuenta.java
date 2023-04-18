/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg4.pkg4.pkg2023.cosas;

/**
 *
 * @author Nahuel
 */
public class Cuenta {
    private String tipo;
    private double saldo;
    private Cliente titular;

    public Cuenta(String tipo, double saldo, Cliente titular) {
        this.tipo = tipo;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
}
