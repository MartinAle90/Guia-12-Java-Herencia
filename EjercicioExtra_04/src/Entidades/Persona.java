/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//identificación y su estado civil.

public class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer numIden;
    protected String estadoCivil;
    protected Character jerarquia;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer numIden, String estadoCivil, Character jerarquia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numIden = numIden;
        this.estadoCivil = estadoCivil;
        this.jerarquia = jerarquia;
    }
    
    
    


    
    
}
