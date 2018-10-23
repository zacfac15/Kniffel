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

@RunWith(Parameterized.class)
public class FullHouseTest
{

  CalcPoints test = new CalcPoints();

  @Parameterized.Parameters
  public static Collection<Object> data()
  {
    return Arrays.asList(new Object[][]
    {
      {
        new int[]
        {
          1, 1, 4, 1, 4
        }, 25
      },
      {
        new int[]
        {
          6, 6, 5, 5, 5
        }, 25
      },
      {
        new int[]
        {
          2, 6, 2, 6, 6
        }, 25
      },
      {
        new int[]
        {
          3, 2, 2, 3, 2
        }, 25
      },
      {
        new int[]
        {
          4, 4, 4, 1, 1
        }, 25
      },
      {
        new int[]
        {
          2, 6, 1, 6, 6
        }, 0
      },
      {
        new int[]
        {
          2, 6, 2, 6, 1
        }, 0
      },
    });
  }

  public int[] wuerfe;
  public int expResult;

  public FullHouseTest(int[] wuerfe, int expResult)
  {
    this.wuerfe = wuerfe;
    this.expResult = expResult;
  }

  @Test
  public void getFullHouse()
  {
    System.out.println("25 Points");

    int result = 0;

    result = test.getFullHouse(wuerfe);

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