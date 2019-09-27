/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoperationsgit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class OperacionesBasicasTest {

    public OperacionesBasicasTest() {
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
     * Test of sumar method, of class OperacionesBasicas.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 4;
        int b = 4;
        OperacionesBasicas instance = new OperacionesBasicas();
        int expResult = 8;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of restar method, of class OperacionesBasicas.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 4;
        int b = 4;
        OperacionesBasicas instance = new OperacionesBasicas();
        int expResult = 0;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicar method, of class OperacionesBasicas.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 4;
        int b = 4;
        OperacionesBasicas instance = new OperacionesBasicas();
        int expResult = 16;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of dividir method, of class OperacionesBasicas.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 4;
        int b = 4;
        OperacionesBasicas instance = new OperacionesBasicas();
        int expResult = 1;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
    }

}
