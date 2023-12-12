/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Martin
 */
public class ExtraHoteleros extends Alojamiento{
    protected Boolean privado;
    protected Integer cantMtsCuadrado;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(Boolean privado, Integer cantMtsCuadrado, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String gerenteAlojamiento) {
        super(nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, gerenteAlojamiento);
        this.privado = privado;
        this.cantMtsCuadrado = cantMtsCuadrado;
    }



    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getCantMtsCuadrado() {
        return cantMtsCuadrado;
    }

    public void setCantMtsCuadrado(Integer cantMtsCuadrado) {
        this.cantMtsCuadrado = cantMtsCuadrado;
    }

    @Override
    public String toString() {
        return "ExtraHoteleros{"+ super.toString() + "\n privado=" + privado + ",\n cantMtsCuadrado=" + cantMtsCuadrado + '}';
    }
    
    

}
