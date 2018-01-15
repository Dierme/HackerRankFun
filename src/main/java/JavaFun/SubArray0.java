package JavaFun;

import java.util.Scanner;

public class SubArray0 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        //array size
        int n = s.nextInt();

        //array
        int[] array = new int[n];

        for (int i = 0; i<n; i++){
            array[i] = s.nextInt();
        }

        //get subarray number
        FunInt cond = (int sum) -> sum < 0;

        int x = getSubArrayNumb(array, cond);
        System.out.println(x);
    }

    //counts subarray numb, where sum < 0
    public static int getSubArrayNumb(int[] a, FunInt cond){

        //the result - number of subarrays satisfying the condition
        int nSubArr = 0;

        for(int i = 0; i<a.length; i++){

            //the amount of checks we should perform on that loop level
            for(int j = i; j<a.length; j++){

                if(cond.compare(sum(a, i, j))){
                    nSubArr++;
//                    for(int k = i; k<=j; k++)
//                        System.out.print(a[k] + " ");
//                    System.out.print("\n");
                }
            }
        }

        return nSubArr;
    }

    public static int sum(int[] a, int sind, int eind){
        int sum = 0;
        for(; sind<=eind; sind++){
            sum += a[sind];
        }

        return sum;
    }


    public interface FunInt{
        public boolean compare(int sum);
    }
}

