package Entidades;

import java.time.LocalDate;

public class Velero extends Barco {
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(String matricula, double eslora, LocalDate anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    




}
// • Número de mástiles para veleros.

