/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02;

import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.ServicioLavadora;
import Servicios.ServicioTelevisor;

/**
 *
 * @author Martin
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
//el precio final de los dos electrodomésticos.

        ServicioLavadora sLava = new ServicioLavadora();
        ServicioTelevisor sTele = new ServicioTelevisor();
        Lavadora lava = sLava.crearLavadora();
        Televisor tele = new Televisor();
        System.out.println("Lavadora");
        sLava.precioFinal();
        System.out.println(lava);
//        System.out.println("Televisor");
//        tele.crearTelevisor();
//        tele.precioFinal();
//        System.out.println(tele);

    }

}
