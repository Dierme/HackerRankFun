package JavaFun;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.ByteArrayInputStream;

/**
 * Unit test for simple App.
 */
public class StaticInitTests
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StaticInitTests( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StaticInitTests.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testStaticInit()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("4 3".getBytes());
        System.setIn(in);
        assertEquals(12, StaticInitBlocks.area);
    }
}
