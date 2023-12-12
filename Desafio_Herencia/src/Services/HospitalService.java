package Services;

import Entities.Familia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Familia> listaFamilia = new ArrayList<>();

    public void crearFamilia() {
        System.out.println("Dame la direccion de la vivienda de la familiar");
        String dir = leer.next();
        System.out.println("Dame el ide de la familia");
        int ide = leer.nextInt();
        System.out.println("Dame el numero de lote");
        int num = leer.nextInt();
        System.out.println("Dame el nombre de barrio");
        String barrio = leer.next();
        System.out.println("Dame el nopmbre de la localidad");
        String local = leer.next();
        String fact;
        System.out.println("Tiene factores de riesgo? S/N");
        fact = leer.next();
        boolean mej = true;
        List<Integer> listaFactores = null;
        if (fact.equalsIgnoreCase("S")) {
            System.out.println("Cuantos factores indentifica");
            int cant = leer.nextInt();
            for (int i = 0; i < cant; i++) {
                System.out.println("Ingrese numero de factor de Reigo");
                listaFactores.add(leer.nextInt());

            }
            mej = false;
        }
//
//        Familia f = new Familia(dir, barrio, local, ide, num, listaFactores, mej));

    }

    public void crearIntegrante() {

    }
}
