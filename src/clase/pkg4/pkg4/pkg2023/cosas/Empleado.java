/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg4.pkg4.pkg2023.cosas;

/**
 *
 * @author Nahuel
 */
public class Empleado extends Persona {
    private int numeroLegajo;
    private int añoAntiguedad;
    private Area area;

    public Empleado(String nombre, String apellido, int dni, int numeroLegajo, int añoAntiguedad, Area area) {
        super(nombre, apellido, dni);
        this.numeroLegajo = numeroLegajo;
        this.añoAntiguedad = añoAntiguedad;
        this.area = area;
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public int getAñoAntiguedad() {
        return añoAntiguedad;
    }

    public void setAñoAntiguedad(int añoAntiguedad) {
        this.añoAntiguedad = añoAntiguedad;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
   
    
    
}
