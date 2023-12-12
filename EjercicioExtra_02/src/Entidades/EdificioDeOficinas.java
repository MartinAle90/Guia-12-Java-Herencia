/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre.
public class EdificioDeOficinas extends Edificio{
    private Integer numeroOficinas;
    private Integer cantPersOfic;
    private Integer numPisos;

    public EdificioDeOficinas() {
    }

    
    public EdificioDeOficinas(Integer numeroOficinas, Integer cantPersOfic, Integer numPisos) {
        this.numeroOficinas = numeroOficinas;
        this.cantPersOfic = cantPersOfic;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas(Integer numeroOficinas, Integer cantPersOfic, Integer numPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantPersOfic = cantPersOfic;
        this.numPisos = numPisos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Integer numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public Integer getCantPersOfic() {
        return cantPersOfic;
    }

    public void setCantPersOfic(Integer cantPersOfic) {
        this.cantPersOfic = cantPersOfic;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }
    
      

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie = this.ancho* this.largo;
        System.out.println("La superficie del edificio de oficina es " + superficie);
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen = this.alto * this.ancho * this.largo;
        System.out.println("El volumen del edificio de oficina es " + volumen);
        return volumen;
    }
    
    
    
}
