/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_01;

import java.time.LocalDate;
import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.Llate;
import Entidades.Motoren;
import Entidades.Velero;

public class EjercicioExtra_01 {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Alquiler alquiler = new Alquiler();
        alquiler.setNombre("Juan");
        alquiler.setDocumento("12345678A");
        alquiler.setFechaAlquiler(LocalDate.of(2021, 1, 1));
        alquiler.setFechaDevolucion(LocalDate.of(2021, 1, 10));
        alquiler.setPosicionAmarre(1);
        alquiler.setBarco(new Velero("1234", 10, LocalDate.of(2020, 1, 1), 2));
        System.out.println(alquiler.costoAlquiler());

        Alquiler alquiler2 = new Alquiler();
        alquiler2.setNombre("Juan");
        alquiler2.setDocumento("12345678A");
        alquiler2.setFechaAlquiler(LocalDate.of(2021, 1, 1));
        alquiler2.setFechaDevolucion(LocalDate.of(2021, 1, 10));
        alquiler2.setPosicionAmarre(1);
        alquiler2.setBarco(new Llate("1234", 10, LocalDate.of(2020, 1, 1), 2, 3));
        System.out.println(alquiler2.costoAlquiler());

        Alquiler alquiler3 = new Alquiler();
        alquiler3.setNombre("Juan");
        alquiler3.setDocumento("12345678A");
        alquiler3.setFechaAlquiler(LocalDate.of(2021, 1, 1));
        alquiler3.setFechaDevolucion(LocalDate.of(2021, 1, 10));
        alquiler3.setPosicionAmarre(1);
        alquiler3.setBarco(new Motoren("1234", 10, LocalDate.of(2020, 1, 1), 2));
        System.out.println(alquiler3.costoAlquiler());

        Alquiler alquiler4 = new Alquiler();
        alquiler4.setNombre("Juan");
        alquiler4.setDocumento("12345678A");
        alquiler4.setFechaAlquiler(LocalDate.of(2021, 1, 1));
        alquiler4.setFechaDevolucion(LocalDate.of(2021, 1, 10));
        alquiler4.setPosicionAmarre(1);
        alquiler4.setBarco(new Barco("1234", 10, LocalDate.of(2020, 1, 1)));
        System.out.println(alquiler4.costoAlquiler());
    }
}
