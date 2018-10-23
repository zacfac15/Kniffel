package beans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
          beans.StrasseTest.class,
          beans.FullHouseTest.class,
          beans.PaschTest.class,
          beans.KniffelTest.class,
          beans.NurEinserTest.class,
          beans.NurZweier.class,
          beans.NurDreier.class,
          beans.NurVierer.class,
          beans.NurFuenfer.class,
          beans.NurSechser.class,
          beans.StrasseTestKlein.class,
        })
public class kniffelTestSuit
{

  @BeforeClass
  public static void setUpClass() throws Exception
  {
  }

  @AfterClass
  public static void tearDownClass() throws Exception
  {
  }

  @Before
  public void setUp() throws Exception
  {
  }

  @After
  public void tearDown() throws Exception
  {
  }

}
