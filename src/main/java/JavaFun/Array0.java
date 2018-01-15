package JavaFun;

import java.util.Scanner;

//one dimensional arrays
public class Array0 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            a[i] = val;
            System.out.println(a[i]);
        }
    }

}
