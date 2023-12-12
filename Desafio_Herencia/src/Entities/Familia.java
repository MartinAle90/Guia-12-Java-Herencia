package Entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Familia {
    protected String direccion, barrio, localidad;
    protected int IDE, lote;
    protected List<Integer> factoresRiesgo;
    protected Boolean mejora;


    public Familia(String direccion, String barrio, String localidad, int IDE, int lote, List<Integer> factoresRiesgo, Boolean mejora) {
        this.direccion = direccion;
        this.barrio = barrio;
        this.localidad = localidad;
        this.IDE = IDE;
        this.lote = lote;
        this.factoresRiesgo = factoresRiesgo;
        this.mejora = mejora;
    }

    public List<Integer> getFactoresRiesgo() {
        return factoresRiesgo;
    }

    public void setFactoresRiesgo(List<Integer> factoresRiesgo) {
        this.factoresRiesgo = factoresRiesgo;
    }

    public Boolean getMejora() {
        return mejora;
    }

    public void setMejora(Boolean mejora) {
        this.mejora = mejora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getIDE() {
        return IDE;
    }

    public void setIDE(int IDE) {
        this.IDE = IDE;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Familia {" +
                "direccion='" + direccion + '\'' +
                ", barrio='" + barrio + '\'' +
                ", localidad='" + localidad + '\'' +
                ", IDE=" + IDE +
                ", lote=" + lote +
                '}';
    }
}
