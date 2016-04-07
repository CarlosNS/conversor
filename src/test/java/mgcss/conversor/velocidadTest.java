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
 * @author JOSE RAMON
 */
public class velocidadTest {

    public velocidadTest() {
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
     * Test of millasxsAkm method, of class velocidad.
     */
    @Test
    public void testMillasxsAkm() {
        try {
            System.out.println("millasxsAkm");
            double millasxs = 5.0;
            velocidad instance = new velocidad();
            double expResult = 8.05;
            double result = instance.millasxsAkm(millasxs);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

    }

    @Test
    public void testMillasxsAkm2() {
        try {
            System.out.println("millasxsAkm");
            double millasxs = 35.0;
            velocidad instance = new velocidad();
            double expResult = 56.35;
            double result = instance.millasxsAkm(millasxs);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of millasxhAkm method, of class velocidad.
     */
    @Test
    public void testMillasxhAkm() {
        try {
            System.out.println("millasxhAkm");
            double millasxs = 100.0;
            velocidad instance = new velocidad();
            double expResult = instance.Redondear(0.0447);
            double result = instance.millasxhAkm(millasxs);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }
    /**
     * Test of millasxhAkm method, of class velocidad.
     */
    @Test
    public void testMillasxhAkm2() {
        try {
            System.out.println("millasxhAkm");
            double millasxs = 35.0;
            velocidad instance = new velocidad();
            double expResult = instance.Redondear(0.01565);
            double result = instance.millasxhAkm(millasxs);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of piesxsAkm method, of class velocidad.
     */
    @Test
    public void testPiesxsAkm() {
        try {
            System.out.println("piesxsAkm");
            double x = 35.0;
            double expResult = velocidad.Redondear(0.010675);
            double result = velocidad.piesxsAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }
    /**
     * Test of piesxsAkm method, of class velocidad.
     */
    @Test
    public void testPiesxsAkm2() {
        try {
            System.out.println("piesxsAkm");
            double x = 100.0;
            double expResult = velocidad.Redondear(0.0305);
            double result = velocidad.piesxsAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }
    

    /**
     * Test of nudosAkm method, of class velocidad.
     */
    @Test
    public void testNudosAkm() {
        try {
            System.out.println("nudosAkm");
            double x = 35.0;
            double expResult = velocidad.Redondear(0.01799);
            double result = velocidad.nudosAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }
    @Test
    public void testNudosAkm2() {
        try {
            System.out.println("nudosAkm");
            double x = 100.0;
            double expResult = velocidad.Redondear(0.0514);
            double result = velocidad.nudosAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of vluzAkm method, of class velocidad.
     */
    @Test
    public void testVluzAkm() {
        try {
            System.out.println("vluzAkm");
            float x = 5.0F;
            float expResult = 1498962.3F;
            float result = velocidad.vluzAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }
    /**
     * Test of vluzAkm method, of class velocidad.
     */
    @Test
    public void testVluzAkm2() {
        try {
            System.out.println("vluzAkm");
            float x = 100.0F;
            float expResult = 29979246.0F;
            float result = velocidad.vluzAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }
    /**
     * Test of caminataAkm method, of class velocidad.
     */
    @Test
    public void testVsonidoAkm() {
        try {
            System.out.println("vsonidoAkm");
            double x = 35.0;
            double expResult = 11.9;
            double result = velocidad.vsonidoAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

    }
    /**
     * Test of caminataAkm method, of class velocidad.
     */
    @Test
    public void testVsonidoAkm2() {
        try {
            System.out.println("vsonidoAkm");
            double x = 5.0;
            double expResult = 1.7;
            double result = velocidad.vsonidoAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

    }
    /**
     * Test of caminataAkm method, of class velocidad.
     */
    @Test
    public void testCaminataAkm() {
        try {
            System.out.println("caminataAkm");
            double x = 67.0;
            double expResult = velocidad.Redondear(0.1139);
            double result = velocidad.caminataAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

    }
    /**
     * Test of caminataAkm method, of class velocidad.
     */
    @Test
    public void testCaminataAkm2() {
        try {
            System.out.println("caminataAkm");
            double x = 35.0;
            double expResult = velocidad.Redondear(0.0595);
            double result = velocidad.caminataAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

    }

    /**
     * Test of caracolAkm method, of class velocidad.
     */
    @Test
    public void testCaracolAkm() {
        try {
            System.out.println("caracolAkm");
            double x = 25900.0;
            double expResult = velocidad.Redondear(0.0259);
            double result = velocidad.caracolAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }
    /**
     * Test of caracolAkm method, of class velocidad.
     */
    @Test
    public void testCaracolAkm2() {
        try {
            System.out.println("caracolAkm");
            double x = 23888.0;
            double expResult = velocidad.Redondear(0.023888);
            double result = velocidad.caracolAkm(x);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

}
