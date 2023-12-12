package ejercicio_04;

import entidades.*;

/**
 *
 * @author manza
 */
public class ejercicio_04 {

    /* Calcular el área y el perímetro de formas geométricas
En el main se crearán las formas y se mostrará el resultado final. */
    public static void main(String[] args) {

        Rectangulo r = new Rectangulo(10, 5);
        Circulo c = new Circulo(20);

        System.out.println("Rectangulo"
                + "\n  Superficie : " + r.calcularSuperficie()
                + "\n  Perimetro : " + r.calcularPerimetro()
                + "\nCirculo"
                + "\n  Superficie : " + c.calcularSuperficie()
                + "\n  Perimetro : " + c.calcularPerimetro());

    }

}
