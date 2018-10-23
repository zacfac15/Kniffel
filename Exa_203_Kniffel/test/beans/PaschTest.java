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
public class PaschTest
{

    private CalcPoints instance = new CalcPoints();

    @Parameterized.Parameters
    public static Collection<Object> data()
    {
        return Arrays.asList(new Object[][]
        {
            {
                new int[]
                {
                    1, 2, 5, 2, 2
                }, 12
            },
            {
                new int[]
                {
                    5, 5, 5, 2, 1
                }, 18
            },
            {
                new int[]
                {
                    1, 4, 1, 1, 3
                }, 10
            },
            {
                new int[]
                {
                    1, 3, 3, 3, 3
                }, 13
            },
            {
                new int[]
                {
                    4, 4, 4, 1, 4
                }, 17
            },
            {
                new int[]
                {
                    6, 6, 2, 6, 6
                }, 26
            },
            {
                new int[]
                {
                    2, 2, 5, 2, 2
                }, 13
            },
            {
                new int[]
                {
                    5, 5, 5, 5, 1
                }, 21
            },
            {
                new int[]
                {
                    1, 1, 1, 1, 3
                }, 7
            },
            {
                new int[]
                {
                    1, 3, 6, 3, 3
                }, 16
            },
            {
                new int[]
                {
                    5, 4, 4, 1, 4
                }, 18
            },
            {
                new int[]
                {
                    5, 6, 2, 6, 6
                }, 25
            },
            {
                new int[]
                {
                    1, 1, 1, 1, 1
                }, 0
            },
            {
                new int[]
                {
                    5, 1, 2, 6, 6
                }, 0
            },
            {
                new int[]
                {
                    5, 6, 2, 3, 1
                }, 0
            }
        });
    }

    public int[] wuerfe;
    public int expResult;

    public PaschTest(int[] wuerfe, int expResult)
    {
        this.wuerfe = wuerfe;
        this.expResult = expResult;
    }

    @Test
    public void getPasch()
    {
        System.out.println("3er Pasch oder 4er Pasch");

        int result = 0;

        result = instance.getPasch(wuerfe);

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
