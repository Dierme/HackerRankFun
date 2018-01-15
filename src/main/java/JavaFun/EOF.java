package JavaFun;

import java.util.Scanner;

public class EOF {
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int c = 0;

        while(in.hasNext()){
            c++;
            String line = in.nextLine();
            System.out.println(c+" " +line);
        }
    }
}
