/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgcss.conversor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Surface Barrous
 */
public class volumenTest {
    
    private double redondear(double numero)
    {
          return Math.round(numero * 100.0) / 100.0;
    }
    
    public volumenTest() {
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
     * Test of barril method, of class volumen.
     */
    
    @Test
    public void testBarril1() {
        try {
        System.out.println("Test barriles 1");
        double barril = 1;
        double expResult = 163.65;
        double result = volumen.barril(barril);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testBarril2() {
        try {
        System.out.println("Test barriles 2");
        double barril = 3;
        double expResult = 490.95;
        double result = volumen.barril(barril);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testBarril3() {
        try {
        System.out.println("Test barriles 3");
        double barril = 10;
        double expResult = redondear(1636.5);
        double result = volumen.barril(barril);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }

    /**
     * Test of picotazo method, of class volumen.
     */
    @Test
    public void testPicotazo1() {
        try {
        System.out.println("Test picotazo 1");
        double picotazo = 1;
        double expResult = 8.80;
        double result = volumen.picotazo(picotazo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testPicotazo2() {
        try {
        System.out.println("Test picotazo 2");
        double picotazo = 3;
        double expResult = 26.40;
        double result = volumen.picotazo(picotazo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testPicotazo3() {
        try {
        System.out.println("Test picotazo 3");
        double picotazo = 10;
        double expResult = 88;
        double result = volumen.picotazo(picotazo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }

    /**
     * Test of galon method, of class volumen.
     */
    @Test
    public void testGalon1() {
        try {
        System.out.println("Test galon 1");
        double galon = 1;
        double expResult = 4.54;
        double result = volumen.galon(galon);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testGalon2() {
        try {
        System.out.println("Test galon 2");
        double galon = 3.0;
        double expResult = 13.62;
        double result = volumen.galon(galon);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testGalon3() {
        try {
        System.out.println("Test galon 3");
        double galon = 10;
        double expResult = 45.4;
        double result = volumen.galon(galon);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }

    /**
     * Test of cuarto_galon method, of class volumen.
     */
    @Test
    public void testCuarto_galon1() {
        try {
        System.out.println("Test cuarto de galon 1");
        double cuarto_galon = 1;
        double expResult = 1.13;
        double result = volumen.cuarto_galon(cuarto_galon);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testCuarto_galon2() {
        try {
        System.out.println("Test cuarto de galon 2");
        double cuarto_galon = 3.0;
        double expResult = 3.39;
        double result = volumen.cuarto_galon(cuarto_galon);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testCuarto_galon3() {
        try {
        System.out.println("Test cuarto de galon 3");
        double cuarto_galon = 10;
        double expResult = 11.3;
        double result = volumen.cuarto_galon(cuarto_galon);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }

    /**
     * Test of onza_liquida method, of class volumen.
     */
    @Test
    public void testOnza_liquida1() {
        try {
        System.out.println("Test onza liquida 1");
        double onza_liquida = 1;
        double expResult = 0.03;
        double result = volumen.onza_liquida(onza_liquida);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testOnza_liquida2() {
        try {
        System.out.println("Test onza liquida 2");
        double onza_liquida = 3;
        double expResult = 0.08;
        double result = volumen.onza_liquida(onza_liquida);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
    @Test
    public void testOnza_liquida3() {
        try {
        System.out.println("Test onza liquida 1");
        double onza_liquida = 10;
        double expResult = 0.28;
        double result = volumen.onza_liquida(onza_liquida);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {fail("Test fallido.");}
    }
    
}
