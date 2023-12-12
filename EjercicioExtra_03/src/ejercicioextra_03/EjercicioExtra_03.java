/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_03;

import Comparadores.ComparadorPrecio;
import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencias;
import Servicios.ServiciosAlojamiento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_03 {

    public static void main(String[] args) {

        ServiciosAlojamiento sAloja = new ServiciosAlojamiento();
        ArrayList<Alojamiento> listaAlojamiento = new ArrayList<>();

        Hotel4 hotel4estrellas = new Hotel4('A', "Paquita", 60, 70, 110, 10, 0.0, "4 Estrellas", "Avenida Libertad", "La Pampa", "Jhonatan");
        sAloja.precioHabitacion(hotel4estrellas);
        listaAlojamiento.add(hotel4estrellas);

        Hotel4 hotel4estrellas2 = new Hotel4('B', "Paquita 2", 30, 70, 110, 10, 0.0, "4 Estrellas 2", "Avenida Libertad", "La Pampa", "Jhonatan");
        sAloja.precioHabitacion(hotel4estrellas2);
        listaAlojamiento.add(hotel4estrellas2);

        Alojamiento hotel5estrellas = new Hotel5(2, 5, 10, 'A', "Paquita 3", 60, 70, 110, 10, 0.0, "5 Estrellas", "Avenida Libertad", "La Pampa", "Jhonatan");
        sAloja.precioHabitacion((Hotel5) hotel5estrellas);
        listaAlojamiento.add(hotel5estrellas);

        Camping camp1 = new Camping(20, 5, false, true, 100, "Camping 1", "Avenida Libertad", "La Pampa", "Jhonatan");
        listaAlojamiento.add(camp1);
        Camping camp2 = new Camping(10, 2, true, false, 50, "Camping 2", "Avenida Libertad", "La Pampa", "Jhonatan");
        listaAlojamiento.add(camp2);

        Residencias resd1 = new Residencias(15, false, true, true, 100, "Residencia 1", "Avenida Libertad", "La Pampa", "Jhonatan");
        listaAlojamiento.add(resd1);
        Residencias resd2 = new Residencias(30, true, false, true, 50, "Residencia 2", "Avenida Libertad", "La Pampa", "Jhonatan");
        listaAlojamiento.add(resd2);
        
//        sAloja.ordenar(listaAlojamiento);

        


//        sAloja.listadoAlojamientos(listaAlojamiento);

    }

}
