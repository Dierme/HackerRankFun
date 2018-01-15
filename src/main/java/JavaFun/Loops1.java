package JavaFun;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Loops1
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();


        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int res = 0;
            int prevStepRes = 0;
            for(int k = 0; k<n; k++){
                res = a + prevStepRes + (int)Math.pow(2, k);
                System.out.print(res + " ");
                prevStepRes = res;
            }

            System.out.println();
        }
        in.close();
    }
}
