/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

//    public Lavadora(Integer carga) {
//        this.carga = carga;
//    }
    public Lavadora(Integer carga, Integer precio, Integer peso, String color, Character consumo) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

// Método get y set del atributo carga.
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
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
        return "Lavadora{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + ", carga=" + carga + '}' + '\n';
    }

//• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
    public void crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Indique la carga");
        this.carga = leer.nextInt();
    }

//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condicio
    @Override
    public int precioFinal() {
        this.precio = super.precioFinal();
        if (this.carga > 30) {
            this.precio = this.precio + 500;
        }
        return this.precio;
    }
    
    

}
