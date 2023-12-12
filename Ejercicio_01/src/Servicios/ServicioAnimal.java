/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Martin
 */
public class ServicioAnimal {

    public Perro crearPerro(String nombre, String alimento, Integer edad, String razaAnimal) {
        return new Perro(nombre, alimento, edad, razaAnimal);
    }

    public Gato crearGato(String nombre, String alimento, Integer edad, String razaAnimal) {
        return new Gato(nombre, alimento, edad, razaAnimal);
    }

    public Caballo crearCaballo(String nombre, String alimento, Integer edad, String razaAnimal) {
        return new Caballo(nombre, alimento, edad, razaAnimal);
    }

//    public void Alimentarse(Animal animalAux) {
//        System.out.println(this.alimento);
//    }
    
}
