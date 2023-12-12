/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
        ArrayList<Electrodomestico> listaElectro = new ArrayList<>();

//Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
//el precio final de los dos electrodomésticos.
       
        Lavadora lava1 = new Lavadora(10, 1000, 10, "Azul", 'A');
        Lavadora lava2 = new Lavadora(20, 1000, 20, "Azul", 'B');
        Televisor tele1 = new Televisor(55, false, 1000, 30, "Rojo", 'C');
        Televisor tele2 = new Televisor(40, true, 1000, 40, "Rojo", 'D');

        listaElectro.add(lava1);
        listaElectro.add(lava2);
        listaElectro.add(tele1);
        listaElectro.add(tele2);

        System.out.println(listaElectro);
        
        int totalPrecioLavadora = 0;
        int totalPrecioTelevisor = 0;
        
        for (Electrodomestico electrodomestico : listaElectro) {
            if (electrodomestico instanceof Lavadora) {
                int precioFinalLavadora = electrodomestico.precioFinal();
                totalPrecioLavadora += precioFinalLavadora;
                System.out.println("precio lavadora "+precioFinalLavadora);
            }else if (electrodomestico instanceof Televisor) {
                int precioFinalTelevisor = electrodomestico.precioFinal();
                totalPrecioTelevisor += precioFinalTelevisor;
                System.out.println("precio televisor "+precioFinalTelevisor);
            }
        }
        
        System.out.println("el precio de las lavadoras "+totalPrecioLavadora);
        System.out.println("el precio de las televisiones "+totalPrecioTelevisor);
        
        int precioTotal=0;
        
        System.out.println("precio total es "+(precioTotal+totalPrecioLavadora+totalPrecioTelevisor));

    }
    

}
