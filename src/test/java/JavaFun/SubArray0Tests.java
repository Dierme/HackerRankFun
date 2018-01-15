package JavaFun;

import org.junit.Test;
import org.junit.Assert;

import java.util.Scanner;

public class SubArray0Tests{

    @Test
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

        Assert.assertEquals(9, res);
    }
}
