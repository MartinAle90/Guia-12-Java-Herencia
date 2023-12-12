package Entidades;

import java.time.LocalDate;

public class Llate extends Barco {
    private int potenciaCV;
    private int numeroCamarotes;


    public Llate() {
    }
    public Llate(String matricula, double eslora, LocalDate anioFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }
    public int getPotenciaCV() {
        return potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }
    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }


}
// • Potencia en CV y número de camarotes para yates de lujo.