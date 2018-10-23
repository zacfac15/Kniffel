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
 * @author Luca Peinsold
 */
@RunWith(Parameterized.class)
public class NurEinserTest
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
                    1, 1, 1, 1, 1
                }, 5
            },
            {
                new int[]
                {
                    1, 2, 1, 1, 1
                }, 4
            },
            {
                new int[]
                {
                    3, 1, 1, 1, 3
                }, 3
            },
            {
                new int[]
                {
                    4, 4, 4, 1, 1
                }, 2
            },
            {
                new int[]
                {
                    4, 4, 4, 2, 1
                }, 1
            },
            {
                new int[]
                {
                    4, 4, 4, 2, 2
                }, 0
            }
        });
    }

    public NurEinserTest(int[] wuerfe, int expResult)
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

        result = instance.getZahlen(wuerfe,1);

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
