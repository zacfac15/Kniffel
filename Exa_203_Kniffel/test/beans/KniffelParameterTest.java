/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author fabianzach
 */
@RunWith(Parameterized.class)
public class KniffelParameterTest
{
  @Parameter(value = 0)
  public int[] wuerfe;
  @Parameter(value = 1)
  public int expResult;

  @Parameters
  public static Collection<Object[]> data()
  {
    return Arrays.asList(new Object[][] {
      {new int[]{1,1,1,4,4} , 25},
      {new int[]{5,5,5,4,4} , 25},
      {new int[]{2,3,2,3,2} , 25},
      {new int[]{2,1,1,4,4} , 0},
      {new int[]{1,1,1,3,4} , 0}
    });
  }

//  public KniffelParameterTest(int[] wuerfe, int expResult)
//  {
//    this.wuerfe = wuerfe;
//    this.expResult = expResult;
//  }

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

//   TODO add test methods here.
//   The methods must be annotated with annotation @Test. For example:
//  
  @Test
  public void testFullHouse()
  {
    System.out.println("Full House Test returns "+expResult);
    Arrays.sort(wuerfe);
    int result = CalcPoints.getFullHouse(wuerfe);
    assertEquals(expResult, result);
  }
}
