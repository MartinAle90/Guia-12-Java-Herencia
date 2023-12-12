/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import Servicios.ServicioAnimal;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Ejercicio_01 {

//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
//siguiente:
    public static void main(String[] args) {

        ServicioAnimal sa = new ServicioAnimal();

        ArrayList<Animal> listaAnimales = new ArrayList<>();
        

        listaAnimales.add(sa.crearPerro("Stich", "Carnivoro", 15, "doberman"));
        listaAnimales.add(sa.crearPerro("Teddy", "Croquetas", 10, "Chihuahua"));
        listaAnimales.add(sa.crearGato("Pelusa", "Galletas", 15, "Siames"));
        listaAnimales.add(sa.crearCaballo("Spark", "Pasto", 25, "Fino"));
        for (Animal animales : listaAnimales) {
            animales.Alimentarse();
        }

//        perro1.Alimentarse();
//        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
//        perro2.Alimentarse();
//        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
//        gato1.Alimentarse();
//        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
//        caballo1.Alimentarse();
    }

}
