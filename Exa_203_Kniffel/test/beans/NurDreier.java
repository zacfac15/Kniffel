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
public class NurDreier
{

    private int[] wuerfe;
    private int expResult;

    @Parameterized.Parameters
    public static Collection<Object> data()
    {
        return Arrays.asList(new Object[][]
        {
            {
                new int[]
                {
                    3, 1, 3, 1, 3
                }, 9
            },
            {
                new int[]
                {
                    4, 2, 5, 1, 6
                }, 0
            },
            {
                new int[]
                {
                    3, 1, 1, 1, 3
                }, 6
            },
            {
                new int[]
                {
                    4, 6, 4, 1, 2
                }, 0
            },
            {
                new int[]
                {
                    6, 4, 6, 2, 1
                }, 0
            },
            {
                new int[]
                {
                    3, 3, 3, 3, 3
                }, 15
            }
        });
    }

    public NurDreier(int[] wuerfe, int expResult)
    {
        this.wuerfe = wuerfe;
        this.expResult = expResult;
    }

    @Test
    public void testNurEinser() throws Exception
    {
        System.out.println("Verschieden");

        CalcPoints instance = new CalcPoints();
        int result = 0;

        result = instance.getZahlen(wuerfe,3);

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
