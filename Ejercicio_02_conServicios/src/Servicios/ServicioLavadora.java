/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioLavadora extends ServicioElectrodomestico {

    Lavadora lava = new Lavadora();

    //• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
    public Lavadora crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        crearElectrodomestico();
        System.out.println("Indique la carga");
        lava.setCarga(leer.nextInt());
        return lava;
    }

//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condicio
    @Override
    public int precioFinal() {
        lava.setPrecio(super.precioFinal());
        if (lava.getCarga() > 30) {
            lava.setPrecio(lava.getPrecio()+500);
        }
        return lava.getPrecio();
    }

    @Override
    public String toString() {
        return "ServicioLavadora{" + "lava=" + lava + '}';
    }


    
    

}
