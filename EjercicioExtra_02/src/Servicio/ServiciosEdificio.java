/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Edificio;
import java.util.Scanner;
import Entidades.EdificioDeOficinas;

/**
 *
 * @author Martin
 */
public class ServiciosEdificio {

//De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearEdificio(EdificioDeOficinas edificioAux){
        System.out.println("Cuantas personas entran en cada oficina");
        edificioAux.setCantPersOfic(leer.nextInt());
        System.out.println("Cuantas oficinas hay en el edificio");
        edificioAux.setNumeroOficinas(leer.nextInt());
        System.out.println("Cantidad de pisos en el edificio");
        edificioAux.setNumPisos(leer.nextInt());
        
        
    }
//    Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
    public void cantPersonas(EdificioDeOficinas edificioAux){
        int cantPersEdificio;
        int cantPersPiso;
        
        cantPersEdificio = edificioAux.getCantPersOfic()*edificioAux.getNumPisos()*edificioAux.getNumeroOficinas();
        cantPersPiso = cantPersEdificio/edificioAux.getNumPisos();
        
        System.out.println("Cantidad de personas por piso es "+cantPersPiso);
        System.out.println("Cantidad de personas en todo el edificio es "+cantPersEdificio);
    }

}
