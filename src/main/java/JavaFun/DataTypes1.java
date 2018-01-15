package JavaFun;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class DataTypes1
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                String output = "";
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
                    output = "* byte\n* short\n* int\n";
                }
                else if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
                    output = "* short\n* int\n";
                }
                else if(x>=Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                    output = "* int\n";
                }
                output += "* long\n";
                System.out.print(output);
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
