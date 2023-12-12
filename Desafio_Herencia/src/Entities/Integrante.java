package Entities;

import java.time.LocalDate;
import java.util.List;

public class Integrante extends Familia{
    protected int numeroDeOrden, DNI, edad;
    protected String apellido, nombre, tipoPersona;
    protected LocalDate fechaNacimiento;
    protected char sexo;
    protected Boolean vinculo;


    public Integrante(String direccion, String barrio, String localidad, int IDE, int lote, List<Integer> factoresRiesgo, Boolean mejora, int numeroDeOrden, int DNI, int edad, String apellido, String nombre, String tipoPersona, LocalDate fechaNacimiento, char sexo, Boolean vinculo) {
        super(direccion, barrio, localidad, IDE, lote, factoresRiesgo, mejora);
        this.numeroDeOrden = numeroDeOrden;
        this.DNI = DNI;
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipoPersona = tipoPersona;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.vinculo = vinculo;
    }

    public int getNumeroDeOrden() {
        return numeroDeOrden;
    }

    public void setNumeroDeOrden(int numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Boolean getVinculo() {
        return vinculo;
    }

    public void setVinculo(Boolean vinculo) {
        this.vinculo = vinculo;
    }

    @Override
    public String toString() {
        return super.toString() +"{ Integrante {" +
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
