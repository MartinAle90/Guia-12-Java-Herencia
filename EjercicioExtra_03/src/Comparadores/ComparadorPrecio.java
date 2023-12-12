/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidades.Alojamiento;
import Entidades.Hotel;
import Entidades.Hotel4;
import java.util.Comparator;

/**
 *
 * @author Martin
 */
public class ComparadorPrecio extends Hotel implements Comparable<Hotel> {

    @Override
    public int compareTo(Hotel t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public static Comparator<Hotel> ordenarMayorAMenor = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t.getPrecioHabHotel().compareTo(t1.getPrecioHabHotel());
            
        }
    };
    
}
