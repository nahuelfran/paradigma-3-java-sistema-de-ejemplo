/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg4.pkg4.pkg2023.cosas;

/**
 *
 * @author Nahuel
 */
public class Seguro {
    private String tipo;
    private double monto;

    public Seguro(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }
      
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
      
      
}
