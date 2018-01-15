package JavaFun;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArrayList0 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        //number of lines
        int rows = input.nextInt();
        input.nextLine();

        ArrayList<String> matrix= new ArrayList<>();

        //reading lines into ArrayList
        for(int i = 0; i < rows; i++){
            String line = input.nextLine();
            matrix.add(line);
        }

        //query numbers
        int qn = input.nextInt();
        input.nextLine();

        //perform query
        for(int i = 0; i < qn; i++){
            int nline = input.nextInt()-1;         //user friendly input
            int nposition = input.nextInt();
            input.nextLine();

            try {
                System.out.println(search(matrix, nposition, nline));
            }
            catch (IndexOutOfBoundsException | NoSuchElementException e) {
                System.out.println("ERROR!");
            }
        }
    }

    public static int search(ArrayList<String> a, int pos, int nline)
            throws IndexOutOfBoundsException, NoSuchElementException{

            String line = a.get(nline);
            Scanner ls = new Scanner(line);
            int val = 0;
            int j = 0;

            while (j <= pos){
                val = ls.nextInt();
                j++;
            }
            return val;
    }
}
