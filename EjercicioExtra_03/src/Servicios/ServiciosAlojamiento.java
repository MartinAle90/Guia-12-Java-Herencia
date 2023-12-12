/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.ExtraHoteleros;
import Entidades.Hotel;
import Entidades.Hotel4;
import Entidades.Hotel5;
import com.sun.media.sound.AlawCodec;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class ServiciosAlojamiento {

//    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
//agregado por gimnasio) + (valor agregado por limosinas). 
//    Valor agregado por el restaurante:
//• $10 si la capacidad del restaurante es de menos de 30 personas.
//• $30 si está entre 30 y 50 personas.
//• $50 si es mayor de 50. 
    public double precioHabitacion(Hotel4 aloja) {
        aloja.setPrecioHabHotel(50.0
                + (1.0 * aloja.getCantHabHotel() * aloja.getNumCamasHotel())
                + agregRestaurante(aloja.getCapacRestHotel())
                + agregGimnasio(aloja.getGimnasioHotel()));
        return aloja.getPrecioHabHotel();
    }

    public double precioHabitacion(Hotel5 aloja) {
        aloja.setPrecioHabHotel(50.0
                + (1.0 * aloja.getCantHabHotel() * aloja.getNumCamasHotel())
                + agregRestaurante(aloja.getCapacRestHotel())
                + agregGimnasio(aloja.getGimnasioHotel())
                + agregLimosina(aloja.getCantLimosinas()));
        return aloja.getPrecioHabHotel();
    }

    private double agregRestaurante(int capacRest) {
        double precioAgregado = 0;
        if (capacRest < 30) {
            precioAgregado = +10;
        } else if (capacRest >= 30 && capacRest <= 50) {
            precioAgregado = +30;
        } else if (capacRest > 50) {
            precioAgregado = +50;
        }
        return precioAgregado;
    }

    private double agregGimnasio(char tipoGym) {
        double precioAgregado = 0;
        if ('A' == tipoGym) {
            precioAgregado = +50;
        } else if ('B' == tipoGym) {
            precioAgregado = +30;
        }
        return precioAgregado;
    }

    private double agregLimosina(int cantLimo) {
        double precioAgregado = 15 * cantLimo;
        return precioAgregado;
    }

    public void listadoAlojamientos(ArrayList<Alojamiento> lista) {
        for (Alojamiento aloja : lista) {
            System.out.println(aloja);
            System.out.println("");
        }
    }

//    public void ordenar(ArrayList<Alojamiento> lista) {
//        ArrayList<Hotel> listaAux = new ArrayList<>();
//        for (int i = 1; i < lista.size(); i++) {
//            if (lista.get(i) instanceof Hotel) {
//                listaAux.add((Hotel) lista.get(i));
//            }
//        }
//        ArrayList<Hotel> listaAuxFinal = new ArrayList<>();
//        Hotel aux = new Hotel();
//
//        for (int i = 0; i < listaAux.size() - 1; i++) {
//            listaAuxFinal.add(aux.compareTo(listaAux.get(i), listaAux.get(i + 1)));
//        }
//
//        System.out.println(listaAux);
//    }

}
