/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

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
public class PolideportivoTest {
    
    Polideportivo poli = new Polideportivo("Poli 1", true, 10.0, 100.0, 50.0);
    
    public PolideportivoTest() {
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
     * Test of getNombrePoli method, of class Polideportivo.
     */
    @Test
    public void testGetNombrePoli() {
        System.out.println("getNombrePoli");

        String expResult = "Poli 1";
        String result = poli.getNombrePoli();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setNombrePoli method, of class Polideportivo.
     */
    @Test
    public void testSetNombrePoli() {
        System.out.println("setNombrePoli");
        String nombrePoli = "Poli 1";
 
        poli.setNombrePoli(nombrePoli);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of getTechado method, of class Polideportivo.
     */
    @Test
    public void testGetTechado() {
        System.out.println("getTechado");
  
        Boolean expResult = true;
        Boolean result = poli.getTechado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setTechado method, of class Polideportivo.
     */
    @Test
    public void testSetTechado() {
        System.out.println("setTechado");
        Boolean techado = true;

        poli.setTechado(techado);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of calcularSuperficie method, of class Polideportivo.
     */
    @Test
    public void testCalcularSuperficie() {
        System.out.println("calcularSuperficie");

        double expResult = 0.0;
        double result = poli.calcularSuperficie();
        assertEquals(expResult, result, 500.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calcularVolumen method, of class Polideportivo.
     */
    @Test
    public void testCalcularVolumen() {
        System.out.println("calcularVolumen");

        poli.calcularVolumen();
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
