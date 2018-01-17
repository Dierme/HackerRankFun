package JavaFun;

import org.junit.Test;
import org.junit.Assert;

import java.util.Scanner;

public class Array2Tests {

    public static int[] va;
    public static int[] a;
    public static int leap;
    public static int n;

    public static void init(String initData){
        Scanner s = new Scanner(initData);
        n = s.nextInt();
        leap = s.nextInt();

        a = new int[n];
        va = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            va[i] = 0;
        }
    }

    //init string
    //0 - length of array
    //1 - leap size
    //rest - array (a swamp to pass)
    @Test
    public void yesPassTrivialCase(){
        String s = "5 3 0 0 0 0 0";
        init(s);
        Assert.assertEquals(true, Array2.canPassSwamp(a, va, leap, 0));
    }

    @Test
    public void noPassTrivialCase(){
        String s = "5 3 1 1 1 1 1";
        init(s);
        Assert.assertEquals(false, Array2.canPassSwamp(a, va, leap, 0));
    }

    @Test
    public void noPassHardCase(){
        String s = "48 22 0 1 1 1 1 1 0 1 0 0 1 0 1 1 1 0 1 0 1 0 1 1 1 0 0 0 1 1 1 1 0 0 1 1 1 1 1 0 0 1 1 0 1 1 1 1 1 1";
        init(s);
        Assert.assertEquals(false, Array2.canPassSwamp(a, va, leap, 0));
    }

    @Test
    public void yesPassHardCase(){
        String s = "36 9\n" +
                "0 1 1 1 1 0 1 0 1 0 1 1 0 1 1 1 1 1 0 0 1 1 1 1 1 1 0 0 1 1 1 1 1 0 0 0";
        init(s);
        Assert.assertEquals(true, Array2.canPassSwamp(a, va, leap, 0));
    }
}
