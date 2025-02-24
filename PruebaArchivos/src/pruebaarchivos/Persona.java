/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarchivos;

import java.io.Serializable;

/**
 *
 * @author sguardatb
 */
public class Persona implements Serializable{
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona de nombre: " + nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
