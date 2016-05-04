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
 * @author Carlos Naranjo Sánchez
 */
public class temperaturaTest {

    public temperaturaTest() {
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
     * Test del método para convertir celsius a kelvin.
     */
    @Test
    public void celsiusKelvin() {
        try {
            double celsius = 1;
            double expResult = 274.15;
            double result = temperatura.celsius_to_kelvin(celsius);
            assertEquals(expResult, result, 0.0);

        } catch (Exception e) {
            fail("fallo");
        }

    }
    
    @Test
    public void celsiusKelvin2() {
        try {
            double celsius = 0;
            double expResult = 273.15;
            double result = temperatura.celsius_to_kelvin(celsius);
            assertEquals(expResult, result, 0.0);

        } catch (Exception e) {
            fail("fallo");
        }

    }

    @Test
    public void farenheitKelvin() {
        try {
            double far = 1;
            double expResult = 255.92777;
            double result = temperatura.farenheit_to_kelvin(far);
            assertEquals(expResult, result, 0.001);

        } catch (Exception e) {
            fail("fallo");
        }

    }
    
    @Test
    public void farenheitKelvin2() {
        try {
            double far = 0;
            double expResult = 255.3722;
            double result = temperatura.farenheit_to_kelvin(far);
            assertEquals(expResult, result, 0.001);

        } catch (Exception e) {
            fail("fallo");
        }

    }

    @Test
    public void romerKelvin() {
        try {
            double rom = 1;
            double expResult = 260.769;
            double result = temperatura.romer_to_kelvin(rom);
            assertEquals(expResult, result, 0.001);

        } catch (Exception e) {
            fail("fallo");
        }

    }
    
    @Test
    public void romerKelvin2() {
        try {
            double rom = 0;
            double expResult = 258.864285;
            double result = temperatura.romer_to_kelvin(rom);
            assertEquals(expResult, result, 0.001);

        } catch (Exception e) {
            fail("fallo");
        }

    }

    @Test
    public void reaumurKelvin() {
        try {
            double rea = 1;
            double expResult = 274.4;
            double result = temperatura.reaumur_to_kelvin(rea);
            assertEquals(expResult, result, 0.001);

        } catch (Exception e) {
            fail("fallo");
        }

    }
    
    @Test
    public void reaumurKelvin2() {
        try {
            double rea = 0;
            double expResult = 273.15;
            double result = temperatura.reaumur_to_kelvin(rea);
            assertEquals(expResult, result, 0.001);

        } catch (Exception e) {
            fail("fallo");
        }

    }

    @Test
    public void newtonKelvin() {
        try {
            double newt = 1;
            double expResult = 276.180303;
            double result = temperatura.newton_to_kelvin(newt);
            assertEquals(expResult, result, 0.001);

        } catch (Exception e) {
            fail("fallo");
        }

    }
    
    @Test
    public void newtonKelvin2() {
        try {
            double newt = 0;
            double expResult = 273.15;
            double result = temperatura.newton_to_kelvin(newt);
            assertEquals(expResult, result, 0.001);

        } catch (Exception e) {
            fail("fallo");
        }

    }
}
