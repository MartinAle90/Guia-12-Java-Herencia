package Entidades;

import java.time.LocalDate;

public class Motoren extends Barco {
    private int potenciaCV;

    public Motoren() {
    }

    public Motoren(String matricula, double eslora, LocalDate anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    
    
}
// • Potencia en CV para barcos a motor.