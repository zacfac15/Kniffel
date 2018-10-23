/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author fabianzach
 */
public class CalcPointsTest
{

  public CalcPointsTest()
  {
  }

  @BeforeClass
  public static void setUpClass()
  {
  }

  @AfterClass
  public static void tearDownClass()
  {
  }

  @Before
  public void setUp()
  {
  }

  @After
  public void tearDown()
  {
  }

  /**
   * Test of calculatePoints method, of class CalcPoints.
   */
  @Test
  public void testCalculatePoints()
  {
    System.out.println("calculatePoints");
    int[] wuerfel = null;
    KniffelValue auswahl = null;
    int expResult = 0;
    int result = CalcPoints.calculatePoints(wuerfel, auswahl);
    assertEquals(expResult, result);

  }

  /**
   * Test of getZahlen method, of class CalcPoints.
   */
  @Test
  public void testGetZahlen()
  {
    System.out.println("getZahlen");
    int[] wuerfel = null;
    int z = 0;
    int expResult = 0;
    int result = CalcPoints.getZahlen(wuerfel, z);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getPasch method, of class CalcPoints.
   */
  @Test
  public void testGetPasch()
  {
    System.out.println("getPasch");
    int[] wuerfel = new int[]
    {
      1, 1, 1, 2, 3
    };
    int expResult = 8;
    int result = CalcPoints.getPasch(wuerfel);
    assertEquals(expResult, result);
  }

  /**
   * Test of getKniffel method, of class CalcPoints.
   */
  @Test
  public void testGetKniffel()
  {
    System.out.println("Kniffel hat 50 Punkte");
    int[] wuerfel = new int[]
    {
      1, 1, 1, 1, 1
    };
    int expResult = 50;
    int result = CalcPoints.getKniffel(wuerfel);
    assertEquals(expResult, result);
  }

  /**
   * Test of getStrasseKlein method, of class CalcPoints.
   */
  @Test
  public void testGetStrasseKlein()
  {
    System.out.println("getStrasseKlein");
    int[] wuerfel = null;
    int expResult = 0;
    int result = CalcPoints.getStrasseKlein(wuerfel);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getStrasseGross method, of class CalcPoints.
   */
  @Test
  public void testGetStrasseGross()
  {
    System.out.println("getStrasseGross");
    int[] wuerfel = null;
    int expResult = 0;
    int result = CalcPoints.getStrasseGross(wuerfel);
    assertEquals(expResult, result);
  }

  @Test
  public void testGetFullHouse()
  {
    System.out.println("Full House Test returns 25");
    int[] wuerfel = new int[]
    {
      1, 2, 1, 1, 2
    };
    int expResult = 25;
    int result = CalcPoints.getFullHouse(wuerfel);
    assertEquals(expResult, result);
  }

  @Test(expected = NumberFormatException.class)
  public void testGetFullHouse2()
  {
    System.out.println("Full House Test2 throws exeption");
    int[] wuerfel = null;
    int expResult = 0;
    int result = CalcPoints.getFullHouse(wuerfel);
    assertEquals(expResult, result);
  }

}
