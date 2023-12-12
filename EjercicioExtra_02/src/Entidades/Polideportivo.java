/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
//Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
public class Polideportivo extends Edificio {

    private String nombrePoli;
    private Boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombrePoli, Boolean techado) {
        this.nombrePoli = nombrePoli;
        this.techado = techado;
    }

    public Polideportivo(String nombrePoli, Boolean techado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombrePoli = nombrePoli;
        this.techado = techado;
    }

    public String getNombrePoli() {
        return nombrePoli;
    }

    public void setNombrePoli(String nombrePoli) {
        this.nombrePoli = nombrePoli;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie = this.ancho* this.largo;
        System.out.println("La superficie del polideportivo es " + superficie);
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen = this.alto * this.ancho * this.largo;
        System.out.println("El volumen del polideportivo es " + volumen);
        return volumen;
    }

}
