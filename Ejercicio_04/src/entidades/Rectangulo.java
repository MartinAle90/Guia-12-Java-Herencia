package entidades;

import interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {

    private double lado1;
    private double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double calcularSuperficie() {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        return (lado1 + lado2) * 2;
    }

}
