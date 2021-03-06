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
public class NurVierer
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
                    3, 4, 3, 4, 3
                }, 8
            },
            {
                new int[]
                {
                    1, 4, 1, 1, 6
                }, 4
            },
            {
                new int[]
                {
                    3, 6, 6, 1, 3
                }, 0
            },
            {
                new int[]
                {
                    4, 4, 4, 1, 2
                }, 12
            },
            {
                new int[]
                {
                    4, 3, 4, 2, 6
                }, 8
            },
            {
                new int[]
                {
                    2, 6, 5, 2, 2
                }, 0
            }
        });
    }

    public NurVierer(int[] wuerfe, int expResult)
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

        result = instance.getZahlen(wuerfe,4);

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
