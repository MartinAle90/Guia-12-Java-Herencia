package Entities;

import java.time.LocalDate;
import java.util.List;

public class Adulto extends Joven {

    private Boolean obraSocial;

    public Adulto(String direccion, String barrio, String localidad, int IDE, int lote, List<Integer> factoresRiesgo, Boolean mejora, int numeroDeOrden, int DNI, int edad, String apellido, String nombre, String tipoPersona, LocalDate fechaNacimiento, char sexo, Boolean vinculo, String estudio, Boolean deporte, Boolean trabajo, Boolean obraSocial) {
        super(direccion, barrio, localidad, IDE, lote, factoresRiesgo, mejora, numeroDeOrden, DNI, edad, apellido, nombre, tipoPersona, fechaNacimiento, sexo, vinculo, estudio, deporte, trabajo);
        this.obraSocial = obraSocial;
    }

    public Boolean getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(Boolean obraSocial) {
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return super.toString()+ "{ Adulto {" +
                "obraSocial=" + obraSocial +
                '}';
    }
}
