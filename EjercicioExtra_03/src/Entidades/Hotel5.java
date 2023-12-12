/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
public class Hotel5 extends Hotel4 {

    private Integer cantSalonesConf;
    private Integer cantSuites;
    private Integer cantLimosinas;

    public Hotel5() {
    }

//    public Hotel5(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas) {
//        this.cantSalonesConf = cantSalonesConf;
//        this.cantSuites = cantSuites;
//        this.cantLimosinas = cantLimosinas;
//    }
//
//    public Hotel5(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas, Character gimnasioHotel, String nombreRestHotel, Integer capacRestHotel) {
//        super(gimnasioHotel, nombreRestHotel, capacRestHotel);
//        this.cantSalonesConf = cantSalonesConf;
//        this.cantSuites = cantSuites;
//        this.cantLimosinas = cantLimosinas;
//    }
//
//    public Hotel5(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas, Character gimnasioHotel, String nombreRestHotel, Integer capacRestHotel, Integer cantHabHotel, Integer numCamasHotel, Integer cantPisosHotel, Double precioHabHotel) {
//        super(gimnasioHotel, nombreRestHotel, capacRestHotel, cantHabHotel, numCamasHotel, cantPisosHotel, precioHabHotel);
//        this.cantSalonesConf = cantSalonesConf;
//        this.cantSuites = cantSuites;
//        this.cantLimosinas = cantLimosinas;
//    }

    public Hotel5(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas, Character gimnasioHotel, String nombreRestHotel, Integer capacRestHotel, Integer cantHabHotel, Integer numCamasHotel, Integer cantPisosHotel, Double precioHabHotel, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String gerenteAlojamiento) {
        super(gimnasioHotel, nombreRestHotel, capacRestHotel, cantHabHotel, numCamasHotel, cantPisosHotel, precioHabHotel, nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, gerenteAlojamiento);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(Integer cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + super.toString() + "\n cantSalonesConf=" + cantSalonesConf + ",\n cantSuites=" + cantSuites + ",\n cantLimosinas=" + cantLimosinas + '}';
    }

}
