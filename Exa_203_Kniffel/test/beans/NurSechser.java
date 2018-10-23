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
public class NurSechser
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
                    6, 6, 1, 4, 1
                }, 12
            },
            {
                new int[]
                {
                    4, 5, 5, 3, 2
                }, 0
            },
            {
                new int[]
                {
                    6, 1, 6, 1, 6
                }, 18
            },
            {
                new int[]
                {
                    1, 4, 2, 1, 1
                }, 0
            },
            {
                new int[]
                {
                    6, 2, 5, 4, 6
                }, 12
            },
            {
                new int[]
                {
                    4, 5, 4, 2, 2
                }, 0
            }
        });
    }

    public NurSechser(int[] wuerfe, int expResult)
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

        result = instance.getZahlen(wuerfe,6);

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
