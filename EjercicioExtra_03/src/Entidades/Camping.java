/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
//disponibles y si posee o no un restaurante dentro de las instalaciones. 
public class Camping extends ExtraHoteleros{
    private Integer capCarpas;
    private Integer baniosDisp;
    private Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer capCarpas, Integer baniosDisp, Boolean restaurante, Boolean privado, Integer cantMtsCuadrado, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String gerenteAlojamiento) {
        super(privado, cantMtsCuadrado, nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, gerenteAlojamiento);
        this.capCarpas = capCarpas;
        this.baniosDisp = baniosDisp;
        this.restaurante = restaurante;
    }
    

    
    public Integer getCapCarpas() {
        return capCarpas;
    }

    public void setCapCarpas(Integer capCarpas) {
        this.capCarpas = capCarpas;
    }

    public Integer getBaniosDisp() {
        return baniosDisp;
    }

    public void setBaniosDisp(Integer baniosDisp) {
        this.baniosDisp = baniosDisp;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" 
                + super.toString()
                + "\n capCarpas=" 
                + capCarpas 
                + ",\n baniosDisp=" 
                + baniosDisp 
                + ",\n restaurante=" 
                + restaurante 
                + '}';
    }
    
    
    
}
