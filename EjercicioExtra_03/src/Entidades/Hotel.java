/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

//Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
//características de las distintas categorías son las siguientes:
//• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
//• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
public class Hotel extends Alojamiento implements Comparator {

    protected Integer cantHabHotel;
    protected Integer numCamasHotel;
    protected Integer cantPisosHotel;
    protected Double precioHabHotel;

    public Hotel() {
    }

//    public Hotel(Integer cantHabHotel, Integer numCamasHotel, Integer cantPisosHotel, Double precioHabHotel) {
//        this.cantHabHotel = cantHabHotel;
//        this.numCamasHotel = numCamasHotel;
//        this.cantPisosHotel = cantPisosHotel;
//        this.precioHabHotel = precioHabHotel;
//    }
    public Hotel(Integer cantHabHotel, Integer numCamasHotel, Integer cantPisosHotel, Double precioHabHotel, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String gerenteAlojamiento) {
        super(nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, gerenteAlojamiento);
        this.cantHabHotel = cantHabHotel;
        this.numCamasHotel = numCamasHotel;
        this.cantPisosHotel = cantPisosHotel;
        this.precioHabHotel = precioHabHotel;
    }

    public Integer getCantHabHotel() {
        return cantHabHotel;
    }

    public void setCantHabHotel(Integer cantHabHotel) {
        this.cantHabHotel = cantHabHotel;
    }

    public Integer getNumCamasHotel() {
        return numCamasHotel;
    }

    public void setNumCamasHotel(Integer numCamasHotel) {
        this.numCamasHotel = numCamasHotel;
    }

    public Integer getCantPisosHotel() {
        return cantPisosHotel;
    }

    public void setCantPisosHotel(Integer cantPisosHotel) {
        this.cantPisosHotel = cantPisosHotel;
    }

    public Double getPrecioHabHotel() {
        return precioHabHotel;
    }

    public void setPrecioHabHotel(Double precioHabHotel) {
        this.precioHabHotel = precioHabHotel;
    }

    @Override
    public String toString() {
        return "Hotel{" + super.toString() + "\n cantHabHotel=" + cantHabHotel + ",\n numCamasHotel=" + numCamasHotel + ",\n cantPisosHotel=" + cantPisosHotel + ",\n precioHabHotel=" + precioHabHotel + '}';
    }

    public int compareTo(Hotel o1, Hotel o2) {
        return o2.getPrecioHabHotel().compareTo(o1.getPrecioHabHotel());
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compare(Object t, Object t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator thenComparing(Comparator cmprtr) {
        return Comparator.super.thenComparing(cmprtr); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator thenComparing(Function fnctn, Comparator cmprtr) {
        return Comparator.super.thenComparing(fnctn, cmprtr); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator thenComparing(Function fnctn) {
        return Comparator.super.thenComparing(fnctn); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction tif) {
        return Comparator.super.thenComparingInt(tif); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction tlf) {
        return Comparator.super.thenComparingLong(tlf); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction tdf) {
        return Comparator.super.thenComparingDouble(tdf); //To change body of generated methods, choose Tools | Templates.
    }

}
