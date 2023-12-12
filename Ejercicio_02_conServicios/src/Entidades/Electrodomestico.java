/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Electrodomestico {

    protected Integer precio, peso;
    protected String color;
    protected Character consumo;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, Integer peso, String color, Character consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + '}';
    }
    
//
////    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
////sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
////objeto y no será visible.
//    public char comprobarCosumoEnergetico(char consumoAux) {
//        consumoAux = Character.toUpperCase(consumoAux);
//        if (consumoAux == 'A' || consumoAux == 'B' || consumoAux == 'C' || consumoAux == 'D' || consumoAux == 'E') {
//            return consumoAux;
//        } else {
//            return 'F';
//        }
//    }
//
////    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
////usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
////blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
////minúsculas. Este método se invocará al crear el objeto y no será visible.
//    public String comprobarColor(String colorAux) {
//        colorAux = colorAux.toUpperCase();
//        if (colorAux.equalsIgnoreCase("BLANCO") || colorAux.equalsIgnoreCase("NEGRO") || colorAux.equalsIgnoreCase("ROJO") || colorAux.equalsIgnoreCase("AZUL") || colorAux.equalsIgnoreCase("GRIS")) {
//            return colorAux;
//        } else {
//            return "BLANCO";
//        }
//    }
//
////    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
////electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
////precio se le da un valor base de $1000.
//    public Electrodomestico crearElectrodomestico() {
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//
//        this.precio = 1000;
//        System.out.println("Indique peso:");
//        this.peso = scan.nextInt();
//        System.out.println("Indique color");
//        this.color = scan.next();
//        this.color = comprobarColor(this.color);
//        System.out.println("indique consumo");
//        this.consumo = scan.next().charAt(0);
//        this.consumo = comprobarCosumoEnergetico(this.consumo);
//        return new Electrodomestico(precio, peso, color, consumo);
//
//    }
//
////    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
////precio. Esta es la lista de precios:
//    public int precioFinal() {
//        switch (this.consumo) {
//            case 'A':
//                this.precio = this.precio + 1000;
//                break;
//            case 'B':
//                this.precio = this.precio + 800;
//                break;
//            case 'C':
//                this.precio = this.precio + 600;
//                break;
//            case 'D':
//                this.precio = this.precio + 500;
//                break;
//            case 'E':
//                this.precio = this.precio + 300;
//                break;
//            case 'F':
//                this.precio = this.precio + 100;
//                break;
//            default:
//                System.out.println("no se encontro caracter..");
//                break;
//        }
//        if (this.peso >= 1 && this.peso < 20) {
//            this.precio = this.precio + 100;
//        } else if (this.peso >= 20 && this.peso < 50) {
//            this.precio = this.precio + 500;
//        } else if (this.peso >= 50 && this.peso < 80) {
//            this.precio = this.precio + 800;
//        } else if (this.peso >= 80) {
//            this.precio = this.precio + 1000;
//
//        } else {
//            System.out.println("no se encontro peso");
//        }
//        return this.precio;
//    }

}
