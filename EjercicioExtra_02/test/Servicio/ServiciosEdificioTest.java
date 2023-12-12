/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.EdificioDeOficinas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Martin
 */
public class ServiciosEdificioTest {
    
    public ServiciosEdificioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearEdificio method, of class ServiciosEdificio.
     */
    @Test
    public void testCrearEdificio() {
        System.out.println("crearEdificio");
        EdificioDeOficinas edificioAux = null;
        ServiciosEdificio instance = new ServiciosEdificio();
        instance.crearEdificio(edificioAux);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of cantPersonas method, of class ServiciosEdificio.
     */
    @Test
    public void testCantPersonas() {
        System.out.println("cantPersonas");
        EdificioDeOficinas edificioAux = null;
        ServiciosEdificio instance = new ServiciosEdificio();
        instance.cantPersonas(edificioAux);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
