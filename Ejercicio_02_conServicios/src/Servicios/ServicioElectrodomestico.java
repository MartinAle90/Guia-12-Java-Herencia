/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioElectrodomestico {

    Electrodomestico electro = new Electrodomestico();

    //    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    public char comprobarCosumoEnergetico(char consumoAux) {
        consumoAux = Character.toUpperCase(consumoAux);
        if (consumoAux == 'A' || consumoAux == 'B' || consumoAux == 'C' || consumoAux == 'D' || consumoAux == 'E') {
            return consumoAux;
        } else {
            return 'F';
        }
    }

//    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    public String comprobarColor(String colorAux) {
        colorAux = colorAux.toUpperCase();
        if (colorAux.equalsIgnoreCase("BLANCO") || colorAux.equalsIgnoreCase("NEGRO") || colorAux.equalsIgnoreCase("ROJO") || colorAux.equalsIgnoreCase("AZUL") || colorAux.equalsIgnoreCase("GRIS")) {
            return colorAux;
        } else {
            return "BLANCO";
        }
    }

//    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    public Electrodomestico crearElectrodomestico() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        electro.setPrecio(1000);
        System.out.println("Indique peso:");
        electro.setPeso(scan.nextInt());
        System.out.println("Indique color");
        electro.setColor(scan.next());
        electro.setColor(comprobarColor(electro.getColor()));
        System.out.println("indique consumo");
        electro.setConsumo(scan.next().charAt(0));
        electro.setConsumo(comprobarCosumoEnergetico(electro.getConsumo()));
        return new Electrodomestico(electro.getPrecio(), electro.getPeso(), electro.getColor(), electro.getConsumo());

    }

//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    public int precioFinal() {
        switch (electro.getConsumo()) {
            case 'A':
                electro.setPrecio(electro.getPrecio() + 1000);
                break;
            case 'B':
               electro.setPrecio(electro.getPrecio() + 800);
                break;
            case 'C':
                electro.setPrecio(electro.getPrecio() + 600);
                break;
            case 'D':
               electro.setPrecio(electro.getPrecio() + 500);
                break;
            case 'E':
                electro.setPrecio(electro.getPrecio() + 300);
                break;
            case 'F':
               electro.setPrecio(electro.getPrecio() + 100);
                break;
            default:
                System.out.println("no se encontro caracter..");
                break;
        }
        if (electro.getPeso() >= 1 && electro.getPeso() < 20) {
            electro.setPrecio(electro.getPrecio() + 100);
        } else if (electro.getPeso() >= 20 && electro.getPeso() < 50) {
            electro.setPrecio(electro.getPrecio() + 500);
        } else if (electro.getPeso() >= 50 && electro.getPeso() < 80) {
            electro.setPrecio(electro.getPrecio() + 800);
        } else if (electro.getPeso() >= 80) {
            electro.setPrecio(electro.getPrecio() + 1000);

        } else {
            System.out.println("no se encontro peso");
        }
        return electro.getPrecio();
    }
    
    
//        @Override
//    public String toString() {
//        return "Electrodomestico{" + "precio=" + electro.getPrecio() + ", peso=" + electro.getPeso() + ", color=" + electro.getColor() + ", consumo=" + electro.getConsumo() + '}';
//    }

    @Override
    public String toString() {
        return "ServicioElectrodomestico{" + "electro=" + electro + '}';
    }
    
}
