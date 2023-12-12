/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//Para las residencias se
//indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
//campo deportivo. Realizar un programa en el que se representen todas las relaciones
//descriptas. 
public class Residencias extends ExtraHoteleros{
    private Integer cantHabResid;
    private Boolean descGremios;
    private Boolean campoDep;

    public Residencias() {
    }

    public Residencias(Integer cantHabResid, Boolean descGremios, Boolean campoDep, Boolean privado, Integer cantMtsCuadrado, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String gerenteAlojamiento) {
        super(privado, cantMtsCuadrado, nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, gerenteAlojamiento);
        this.cantHabResid = cantHabResid;
        this.descGremios = descGremios;
        this.campoDep = campoDep;
    }

    
    public Integer getCantHabResid() {
        return cantHabResid;
    }

    public void setCantHabResid(Integer cantHabResid) {
        this.cantHabResid = cantHabResid;
    }

    public Boolean getDescGremios() {
        return descGremios;
    }

    public void setDescGremios(Boolean descGremios) {
        this.descGremios = descGremios;
    }

    public Boolean getCampoDep() {
        return campoDep;
    }

    public void setCampoDep(Boolean campoDep) {
        this.campoDep = campoDep;
    }

    @Override
    public String toString() {
        return "Residencias{" 
                + super.toString() 
                + "\n cantHabResid=" 
                + cantHabResid 
                + ",\n descGremios=" 
                + descGremios 
                + ",\n campoDep=" 
                + campoDep + '}';
    }
    
    
    
}
