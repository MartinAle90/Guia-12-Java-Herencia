/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_02;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Servicio.ServiciosEdificio;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_02 {

//Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
//edificio tendrá como métodos:
//• Método calcularSuperficie(): calcula la superficie del edificio.
//• Método calcularVolumen(): calcula el volumen del edifico.
//Estos métodos serán abstractos y los implementarán las siguientes clases:
//• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
//Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
//• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre.
//De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
//Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
//dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
//métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
//superficie y el volumen de cada edificio.
//Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//cantPersonas() y mostrar los resultados de cada edificio de oficinas.
    public static void main(String[] args) {
        // TODO code application logic here

        ServiciosEdificio se = new ServiciosEdificio();

        ArrayList<Edificio> listaEdificios = new ArrayList<>();

        listaEdificios.add(new Polideportivo("Poli 1", false, 10.0, 100.0, 50.0));
        listaEdificios.add(new Polideportivo("Poli 2", true, 20.0, 50.0, 40.0));
        listaEdificios.add(new EdificioDeOficinas(10, 6, 10, 15.0, 150.0, 40.0));
        listaEdificios.add(new EdificioDeOficinas(8, 5, 10, 5.0, 60.0, 40.0));
     
        int contTechado = 0;
        for (Edificio edificio : listaEdificios) {
            if (edificio instanceof Polideportivo) {
                edificio.calcularSuperficie();
                edificio.calcularVolumen();
                if (((Polideportivo) edificio).getTechado() == true) {
                    contTechado++;
                }
            } else if (edificio instanceof EdificioDeOficinas) {
                edificio.calcularSuperficie();
                edificio.calcularVolumen();
            }

        }
        System.out.println("Cantidad de polideportivos techados es " + contTechado);

    }

}
