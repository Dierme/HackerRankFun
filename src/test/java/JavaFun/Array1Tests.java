package JavaFun;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Scanner;

public class Array1Tests extends TestCase{
    public Array1Tests(String testName )
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


    public void testCalcRightWithNegatives()
    {
        String input = "0 -4 -6 0 -7 -6\n" +
                "-1 -2 -6 -8 -3 -1\n" +
                "-8 -4 -2 -8 -8 -6\n" +
                "-3 -1 -2 -5 -7 -4\n" +
                "-3 -5 -3 -6 -6 -6\n" +
                "-3 -6 0 -8 -6 -7";
        Scanner s = new Scanner(input);

        int arr[][] = new int[Array1.size][Array1.size];

        for(int row=0; row < Array1.size; row++){
            for(int column=0; column < Array1.size; column++){
                arr[row][column] = s.nextInt();
            }
        }

        int maxSum = Array1.calcMaxHourglass(arr);
        assertEquals(-19, maxSum);
    }

    public void testCalcRightWithPositive()
    {
        String input = "1 1 1 0 0 0\n" +
                        "0 1 0 0 0 0\n" +
                        "1 1 1 0 0 0\n" +
                        "0 0 2 4 4 0\n" +
                        "0 0 0 2 0 0\n" +
                        "0 0 1 2 4 0";
        Scanner s = new Scanner(input);

        int arr[][] = new int[Array1.size][Array1.size];

        for(int row=0; row < Array1.size; row++){
            for(int column=0; column < Array1.size; column++){
                arr[row][column] = s.nextInt();
            }
        }

        int maxSum = Array1.calcMaxHourglass(arr);
        assertEquals(19, maxSum);
    }
}

