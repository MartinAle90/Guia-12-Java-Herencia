package Entities;

import java.time.LocalDate;
import java.util.List;

public final class Ninio extends Integrante{

    public Ninio(String direccion, String barrio, String localidad, int IDE, int lote, List<Integer> factoresRiesgo, Boolean mejora, int numeroDeOrden, int DNI, int edad, String apellido, String nombre, String tipoPersona, LocalDate fechaNacimiento, char sexo, Boolean vinculo) {
        super(direccion, barrio, localidad, IDE, lote, factoresRiesgo, mejora, numeroDeOrden, DNI, edad, apellido, nombre, tipoPersona, fechaNacimiento, sexo, vinculo);
    }

    @Override
    public String toString() {
        return "Ninio {" +
                "numeroDeOrden=" + numeroDeOrden +
                ", DNI=" + DNI +
                ", edad=" + edad +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipoPersona='" + tipoPersona + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo=" + sexo +
                ", vinculo=" + vinculo +
                '}';
    }
}
