/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioTelevisor extends ServicioElectrodomestico {

    Televisor tele = new Televisor();

    //• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Indique la resolucion");
        tele.setResolucion(leer.nextInt());
        System.out.println("Tiene sintonisador TDT (s/n)");
        tele.setTdt(leer.next().toLowerCase().charAt(0) == 's');
    }

//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
    @Override
    public int precioFinal() {
        tele.setPrecio(super.precioFinal());
        if (tele.getResolucion() >= 40) {
            tele.setPrecio((tele.getPrecio() * (int) 1.3));
        }
        if (tele.getTdt()) {
            tele.setPrecio(tele.getPrecio() + 500);
        }
        return tele.getPrecio();
    }

}
