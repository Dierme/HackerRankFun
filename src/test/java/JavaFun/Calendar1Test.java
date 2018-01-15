package JavaFun;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class Calendar1Test extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Calendar1Test(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        TestSuite ts = new TestSuite();
        ts.addTestSuite(Calendar1Test.class);
        return ts;
    }

    /**
     * Rigourous Test :-)
     */
    public void testGetDayReturnsCorrectDay()
    {
        String day = Calendar1.getDay("07","07","1995");
        assertEquals("FRIDAY", day);
    }
}
