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
 * @author Daniel
 */
public class masaTest {
    
    public masaTest() {
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
     * Test1 of koku method, of class masa.
     */
    @Test
    public void testKoku1() {
        try{
            System.out.println("koku1");
            double koku = 1.5;
            double expResult = 270.6;
            double result = masa.koku(koku);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test2 of koku method, of class masa.
     */
    @Test
    public void testKoku2() {
        try{
            System.out.println("koku2");
            double koku = 12;
            double expResult = 2164.9;
            double result = masa.koku(koku);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test3 of koku method, of class masa.
     */
    @Test
    public void testKoku3() {
        try {
            System.out.println("koku3");
            double koku = 18762.43;
            double expResult = 3384930;
            double result = masa.koku(koku);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }

    /**
     * Test1 of kann method, of class masa.
     */
    @Test
    public void testKann1() {
        try{
            System.out.println("kann1");
            double kann = 25;
            double expResult = 93.8;
            double result = masa.kann(kann);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test2 of kann method, of class masa.
     */
    @Test
    public void testKann2() {
        try{
            System.out.println("kann2");
            double kann = 15.9;
            double expResult = 59.6;
            double result = masa.kann(kann);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test3 of kann method, of class masa.
     */
    @Test
    public void testKann3() {
        try{
            System.out.println("kann3");
            double kann = 158;
            double expResult = 592.5;
            double result = masa.kann(kann);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }

    /**
     * Test1 of kinn method, of class masa.
     */
    @Test
    public void testKinn1() {
        try{
            System.out.println("kinn1");
            double kinn = 19;
            double expResult = 11.4;
            double result = masa.kinn(kinn);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test2 of kinn method, of class masa.
     */
    @Test
    public void testKinn2() {
        try{
            System.out.println("kinn2");
            double kinn = 75;
            double expResult = 45;
            double result = masa.kinn(kinn);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test3 of kinn method, of class masa.
     */
    @Test
    public void testKinn3() {
        try{
            System.out.println("kinn3");
            double kinn = 189;
            double expResult = 113.4;
            double result = masa.kinn(kinn);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }

    /**
     * Test1 of monnme method, of class masa.
     */
    @Test
    public void testMonnme1() {
        try{
            System.out.println("monnme1");
            double monnme = 71;
            double expResult = 0.3;
            double result = masa.monnme(monnme);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test2 of monnme method, of class masa.
     */
    @Test
    public void testMonnme2() {
        try{
            System.out.println("monnme2");
            double monnme = 852;
            double expResult = 3.2;
            double result = masa.monnme(monnme);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test3 of monnme method, of class masa.
     */
    @Test
    public void testMonnme3() {
        try{
            System.out.println("monnme3");
            double monnme = 7851;
            double expResult = 29.4;
            double result = masa.monnme(monnme);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test1 of tael method, of class masa.
     */
    @Test
    public void testTael1() {
        try{
            System.out.println("tael1");
            double tael = 84;
            double expResult = 3.4;
            double result = masa.tael(tael);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test2 of tael method, of class masa.
     */
    @Test
    public void testTael2() {
        try{
            System.out.println("tael2");
            double tael = 16.35;
            double expResult = 0.7;
            double result = masa.tael(tael);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test3 of tael method, of class masa.
     */
    @Test
    public void testTael3() {
        try{
            System.out.println("tael3");
            double tael = 1658;
            double expResult = 66.3;
            double result = masa.tael(tael);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test1 of ku_ping method, of class masa.
     */
    @Test
    public void testKu_ping1() {
        try{
            System.out.println("ku_ping1");
            double ku_ping = 741;
            double expResult = 29.6;
            double result = masa.ku_ping(ku_ping);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test2 of ku_ping method, of class masa.
     */
    @Test
    public void testKu_ping2() {
        try{
            System.out.println("ku_ping2");
            double ku_ping = 965.29;
            double expResult = 38.6;
            double result = masa.ku_ping(ku_ping);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
    /**
     * Test3 of ku_ping method, of class masa.
     */
    @Test
    public void testKu_ping3() {
        try{
            System.out.println("ku_ping3");
            double ku_ping = 15847;
            double expResult = 633.9;
            double result = masa.ku_ping(ku_ping);
            assertEquals(expResult, result, 0.0);
        }catch(Exception e) {fail("fallo");}
    }
    
}
