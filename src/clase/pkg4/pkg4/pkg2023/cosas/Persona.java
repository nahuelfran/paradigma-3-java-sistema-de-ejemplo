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
public abstract class  Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private ArrayList<Direccion> direccione;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccione = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }   
    
    public ArrayList<Direccion> getDireccione() {
        return direccione;
    }

    public void setDireccione(ArrayList<Direccion> direccione) {
        this.direccione = direccione;
    }
    public void agregarDireccion(Direccion direccion) {
        this.direccione.add(direccion);
    }
    public void eliminarDireccion(Direccion direccion) {
        this.direccione.remove(direccion);
    }
}
    
    


