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
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author zachfabian
 */
@RunWith(Parameterized.class)
public class KniffelTest
{

  private CalcPoints instance = new CalcPoints();

  @Parameters
  public static Collection<Object> data()
  {
    return Arrays.asList(new Object[][]
    {
      {
        new int[]
        {
          1, 1, 1, 1, 1
        }, 50
      },
      {
        new int[]
        {
          2, 2, 2, 2, 2
        }, 50
      },
      {
        new int[]
        {
          3, 3, 3, 3, 3
        }, 50
      },
      {
        new int[]
        {
          4, 4, 4, 4, 4
        }, 50
      },
      {
        new int[]
        {
          5, 5, 5, 5, 5
        }, 50
      },
      {
        new int[]
        {
          6, 6, 6, 6, 6
        }, 50
      },
      {
        new int[]
        {
          1, 2, 3, 4, 5
        }, 0
      },
      {
        new int[]
        {
          2, 3, 4, 5, 6
        }, 0
      },
      {
        new int[]
        {
          2, 2, 2, 1, 2
        }, 0
      },
      {
        new int[]
        {
          2, 2, 3, 1, 2
        }, 0
      },
      {
        new int[]
        {
          2, 3, 3, 1, 2
        }, 0
      },
      {
        new int[]
        {
          2, 3, 3, 1, 4
        }, 0
      }
    });
  }

  public int[] wuerfe;
  public int expResult;

  public KniffelTest(int[] wuerfe, int expResult)
  {
    this.wuerfe = wuerfe;
    this.expResult = expResult;
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

  @Test
  public void testKniffel() throws Exception
  {
    System.out.println("50 Points");

    int result = 0;

    result = instance.getKniffel(wuerfe);

    assertEquals(expResult, result);

  }

}
