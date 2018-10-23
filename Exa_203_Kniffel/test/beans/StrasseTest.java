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

/**
 *
 * @author zachfabian
 */
@RunWith(Parameterized.class)
public class StrasseTest
{

  CalcPoints instance = new CalcPoints();
  private int[] wuerfe;
  private int expResult;

  public StrasseTest(int[] wuerfe, int expResult)
  {
    this.wuerfe = wuerfe;
    this.expResult = expResult;
  }

  @Parameterized.Parameters
  public static Collection<Object> data()
  {
    return Arrays.asList(new Object[][]
    {

      {
        new int[]
        {
          1, 2, 3, 4, 5
        }, 40
      }, 
      {
        new int[]
        {
          2, 3, 4, 5, 6
        }, 40
      },
      {
        new int[]
        {
          1, 1, 2, 3, 4
        }, 0
      }
    });
  }

  @Test
  public void getStrasse()
  {
    System.out.println("40 Points");

    int result = 0;

    result = instance.getStrasseGross(wuerfe);

    assertEquals(expResult, result);
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

}
