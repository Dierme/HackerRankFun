package JavaFun;

import java.util.Scanner;

public class Array2 {


    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        //the amount of queries
        int q = s.nextInt();

        //preforming queries
        for (int i = 0; i < q; i++){

            //query property
            int size = s.nextInt();
            int leap = s.nextInt();

            //query array
            int[] a = new int[size];
            for (int c = 0; c < size; c++){
                a[c] = s.nextInt();
            }

            //check if we can pass array
            boolean canPass = canPassSwamp(a, leap, 0);

            if(canPass){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    public static boolean canPassSwamp(int[] a, int leap, int indx){

        boolean canPass = false;
        int size = a.length;

        if(size <= indx + 1 || size <= indx + leap){
            return true;
        }

        if(a[indx+1] == 0){
            canPass = canPassSwamp(a, leap, indx+1);
        }

        if(a[indx+leap] == 0){
            canPass = canPassSwamp(a, leap, indx+leap);
        }

        return canPass;
    }
}
