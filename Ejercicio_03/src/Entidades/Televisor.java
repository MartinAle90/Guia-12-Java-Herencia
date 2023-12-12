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
public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean tdt;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean tdt) {
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor(Integer resolucion, Boolean tdt, Integer precio, Integer peso, String color, Character consumo) {
        super(precio, peso, color, consumo);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

//Los métodos que se implementara serán:
//• Método get y set de los atributos resolución y sintonizador TDT.
    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }

//    @Override
    public String toString() {
        return "Televisor{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + ", resolucion=" + resolucion + ", tdt=" + tdt + '}'+'\n';
    }
    
//• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Indique la resolucion");
        this.resolucion = leer.nextInt();
        System.out.println("Tiene sintonisador TDT (s/n)");
        this.tdt = leer.next().toLowerCase().charAt(0) == 's';
    }

//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
    @Override
    public int precioFinal() {
        this.precio = super.precioFinal();
         if (resolucion>=40) {
             this.precio = (int)(this.precio*1.3);
         }
         if (tdt) {
             this.precio = this.precio+500;
        }
         return this.precio;
    }

}
