package Entities;

import java.time.LocalDate;
import java.util.List;

public class Joven extends Integrante{

    private String estudio;
    private Boolean deporte, trabajo;

    public Joven(String direccion, String barrio, String localidad, int IDE, int lote, List<Integer> factoresRiesgo, Boolean mejora, int numeroDeOrden, int DNI, int edad, String apellido, String nombre, String tipoPersona, LocalDate fechaNacimiento, char sexo, Boolean vinculo, String estudio, Boolean deporte, Boolean trabajo) {
        super(direccion, barrio, localidad, IDE, lote, factoresRiesgo, mejora, numeroDeOrden, DNI, edad, apellido, nombre, tipoPersona, fechaNacimiento, sexo, vinculo);
        this.estudio = estudio;
        this.deporte = deporte;
        this.trabajo = trabajo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public Boolean getDeporte() {
        return deporte;
    }

    public void setDeporte(Boolean deporte) {
        this.deporte = deporte;
    }

    public Boolean getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Boolean trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        return super.toString()+ " { Joven {" +
                "estudio='" + estudio + '\'' +
                ", deporte=" + deporte +
                ", trabajo=" + trabajo +
                '}';
    }
}
