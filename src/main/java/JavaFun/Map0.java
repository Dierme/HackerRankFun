package JavaFun;

import java.util.HashMap;
import java.util.Scanner;

public class Map0 {

   public static void main(String[] args){

       HashMap<String ,Integer> map = new HashMap<>();

       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       in.nextLine();


       for(int i = 0; i < n; i++)
       {
           String name = in.nextLine();
           int phone = in.nextInt();
           in.nextLine();

           map.put(name, phone);
       }
       while(in.hasNext())
       {
           String s = in.nextLine();

           Integer number = map.get(s);

           String out = number == null ? "Not found" : s+"="+number;
           System.out.println(out);
       }
   }
}
