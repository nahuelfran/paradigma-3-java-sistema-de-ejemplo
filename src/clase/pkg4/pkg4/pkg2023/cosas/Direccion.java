/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg4.pkg4.pkg2023.cosas;

/**
 *
 * @author Nahuel
 */
public class Direccion {
    private String nombreCalle;
    private int numero;
    private String ciudad;

    public Direccion(String nombreCalle, int numero, String ciudad) {
        this.nombreCalle = nombreCalle;
        this.numero = numero;
        this.ciudad = ciudad;
    }
  

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
