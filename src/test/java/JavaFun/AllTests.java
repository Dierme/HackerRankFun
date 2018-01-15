package JavaFun;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AllTests
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AllTests( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        TestSuite ts = new TestSuite();
        ts.addTestSuite(Loops1Test.class);
        ts.addTestSuite(StaticInitTests.class);
        ts.addTestSuite(Calendar1Test.class);
        ts.addTestSuite(Array1Tests.class);
        ts.addTestSuite(SubArray0Tests.class);
        return ts;
    }

    /**
     * Rigourous Test :-)
     */
    public void testLoops1()
    {
        assertTrue( true );
    }
}
