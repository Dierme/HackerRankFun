package JavaFun;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Scanner;

public class SubArray0Tests extends TestCase{

    public SubArray0Tests(String testName ){
        super( testName );
    }

    public static Test suite()
    {
        TestSuite ts = new TestSuite();
        ts.addTestSuite(SubArray0Tests.class);
        return ts;
    }

    public void testCountsCorrectNumberOfSubArrays(){

        String input = "5 1 -2 4 -5 1";
        Scanner s = new Scanner(input);

        //array
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i<n; i++){
            a[i] = s.nextInt();
        }

        SubArray0.FunInt cond = (int sum) -> sum < 0;

        int res = SubArray0.getSubArrayNumb(a, cond);

        assertEquals(9, res);

    }
}
