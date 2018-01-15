package JavaFun;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Array2 {


    public static void main(String args[]){

        try {
            PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
            System.setOut(out);
        }
        catch (FileNotFoundException e){
            System.exit(1);
        }

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

            //visit status array
            int[] va = new int[size];
            for (int c = 0; c < size; c++){
                a[c] = s.nextInt();
                va[c] = 0;
            }

            //check if we can pass array
            boolean canPass = canPassSwamp(a, va, leap,0);

            if(canPass){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    public static boolean canPassSwamp(int[] a, int[] va, int leap, int indx){
        //va - visited array. Fitst run - array full of 0
        //1 - visited
        //0 - NOT visited

        boolean canPass = false;
        int size = a.length;

        if(size <= indx + 1 || size <= indx + leap){
            return true;
        }

        //check if we have visited this cell before
        if(va[indx] == 1){
            return false;
        }

        //setting this cell to visited
        va[indx] = 1;

        //going one in front
        if(a[indx+1] == 0){
            canPass = canPassSwamp(a, va, leap, indx+1);
            if(canPass){
                return canPass;
            }
        }

        //leaping
        if(a[indx+leap] == 0){
            canPass = canPassSwamp(a,va,leap,indx+leap);
            if(canPass){
                return canPass;
            }
        }

        //try to take one step back
        if(indx != 0){
            if(a[indx-1] == 0){
                canPass = canPassSwamp(a,va,leap,indx-1);
            }
            if(canPass){
                return canPass;
            }
        }
        return canPass;
    }
}
