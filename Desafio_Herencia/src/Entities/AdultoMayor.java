package Entities;

import java.time.LocalDate;
import java.util.List;

public class AdultoMayor extends Integrante{

    private Boolean jubilacion;


    public AdultoMayor(String direccion, String barrio, String localidad, int IDE, int lote, List<Integer> factoresRiesgo, Boolean mejora, int numeroDeOrden, int DNI, int edad, String apellido, String nombre, String tipoPersona, LocalDate fechaNacimiento, char sexo, Boolean vinculo, Boolean jubilacion) {
        super(direccion, barrio, localidad, IDE, lote, factoresRiesgo, mejora, numeroDeOrden, DNI, edad, apellido, nombre, tipoPersona, fechaNacimiento, sexo, vinculo);
        this.jubilacion = jubilacion;
    }

    public Boolean getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(Boolean jubilacion) {
        this.jubilacion = jubilacion;
    }

    @Override
    public String toString() {
        return super.toString()+"{ AdultoMayor {" +
                "jubilacion=" + jubilacion +
                '}';
    }
}
