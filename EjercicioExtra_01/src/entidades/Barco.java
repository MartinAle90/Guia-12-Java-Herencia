package Entidades;

import java.time.LocalDate;

public class Barco {
    private String matricula;
    private double eslora;
    private LocalDate anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, LocalDate anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    


}
// Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
// Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
