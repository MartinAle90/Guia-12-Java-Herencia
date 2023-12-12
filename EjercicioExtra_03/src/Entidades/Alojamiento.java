/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//os alojamientos se identifican por un nombre, una dirección,
////una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
////alojamientos: Hoteles y Alojamientos Extrahoteleros.
public class Alojamiento {

    protected String nombreAlojamiento;
    protected String direccionAlojamiento;
    protected String localidadAlojamiento;
    protected String gerenteAlojamiento;

    public Alojamiento() {
    }

    public Alojamiento(String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String gerenteAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
        this.direccionAlojamiento = direccionAlojamiento;
        this.localidadAlojamiento = localidadAlojamiento;
        this.gerenteAlojamiento = gerenteAlojamiento;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public String getDireccionAlojamiento() {
        return direccionAlojamiento;
    }

    public void setDireccionAlojamiento(String direccionAlojamiento) {
        this.direccionAlojamiento = direccionAlojamiento;
    }

    public String getLocalidadAlojamiento() {
        return localidadAlojamiento;
    }

    public void setLocalidadAlojamiento(String localidadAlojamiento) {
        this.localidadAlojamiento = localidadAlojamiento;
    }

    public String getGerenteAlojamiento() {
        return gerenteAlojamiento;
    }

    public void setGerenteAlojamiento(String gerenteAlojamiento) {
        this.gerenteAlojamiento = gerenteAlojamiento;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "\n nombreAlojamiento=" + nombreAlojamiento + ",\n direccionAlojamiento=" + direccionAlojamiento + ",\n localidadAlojamiento=" + localidadAlojamiento + ",\n gerenteAlojamiento=" + gerenteAlojamiento + '}';
    }

}
