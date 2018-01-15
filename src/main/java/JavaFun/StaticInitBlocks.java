package JavaFun;

import java.util.Scanner;

public class StaticInitBlocks {

    public static void main(String args[]){

    }

    public static Scanner s;
    public static int area;
    public static int H;
    public static int B;
    public static boolean flag;

    static {
        flag = true;
        s = new Scanner(System.in);
        int b = s.nextInt();
        int w = s.nextInt();
        try{
            if(b<=0 || w <=0){
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch (Exception e){
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
        if(flag){
            area = b*w;
            System.out.println(area);
        }
    }

}
