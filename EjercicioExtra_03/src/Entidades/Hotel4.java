/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
//• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
public class Hotel4 extends Hotel {

    protected Character gimnasioHotel;
    protected String nombreRestHotel;
    protected Integer capacRestHotel;

    public Hotel4() {
    }

//    public Hotel4(Character gimnasioHotel, String nombreRestHotel, Integer capacRestHotel) {
//        this.gimnasioHotel = gimnasioHotel;
//        this.nombreRestHotel = nombreRestHotel;
//        this.capacRestHotel = capacRestHotel;
//    }
//
//    public Hotel4(Character gimnasioHotel, String nombreRestHotel, Integer capacRestHotel, Integer cantHabHotel, Integer numCamasHotel, Integer cantPisosHotel, Double precioHabHotel) {
//        super(cantHabHotel, numCamasHotel, cantPisosHotel, precioHabHotel);
//        this.gimnasioHotel = gimnasioHotel;
//        this.nombreRestHotel = nombreRestHotel;
//        this.capacRestHotel = capacRestHotel;
//    }

    public Hotel4(Character gimnasioHotel, String nombreRestHotel, Integer capacRestHotel, Integer cantHabHotel, Integer numCamasHotel, Integer cantPisosHotel, Double precioHabHotel, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String gerenteAlojamiento) {
        super(cantHabHotel, numCamasHotel, cantPisosHotel, precioHabHotel, nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, gerenteAlojamiento);
        this.gimnasioHotel = gimnasioHotel;
        this.nombreRestHotel = nombreRestHotel;
        this.capacRestHotel = capacRestHotel;
    }

    public Character getGimnasioHotel() {
        return gimnasioHotel;
    }

    public void setGimnasioHotel(Character gimnasioHotel) {
        this.gimnasioHotel = gimnasioHotel;
    }

    public String getNombreRestHotel() {
        return nombreRestHotel;
    }

    public void setNombreRestHotel(String nombreRestHotel) {
        this.nombreRestHotel = nombreRestHotel;
    }

    public Integer getCapacRestHotel() {
        return capacRestHotel;
    }

    public void setCapacRestHotel(Integer capacRestHotel) {
        this.capacRestHotel = capacRestHotel;
    }

    @Override
    public String toString() {
        return "Hotel4{" + super.toString() + "\n gimnasioHotel=" + gimnasioHotel + ",\n nombreRestHotel=" + nombreRestHotel + ",\n capacRestHotel=" + capacRestHotel + '}';
    }

}
