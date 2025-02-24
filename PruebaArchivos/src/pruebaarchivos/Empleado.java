/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarchivos;

/**
 *
 * @author sguardatb
 */
public class Empleado extends Persona{
    private int clave;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(int clave, double sueldo, String nombre) {
        super(nombre);
        this.clave = clave;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "\n" + getNombre() + "\nClave= " + clave + ", \nSueldo= $" + sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    
    
}
