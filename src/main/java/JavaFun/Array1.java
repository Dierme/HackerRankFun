package JavaFun;

import java.util.Scanner;

public class Array1 {

    public static int size = 6;

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //side size of the square

        int arr[][] = new int[size][size];

        //max sum of a hourglass


        for(int row=0; row < size; row++){
            for(int column=0; column < size; column++){
                arr[row][column] = in.nextInt();
            }
        }

        int maxSum = calcMaxHourglass(arr);

        System.out.println(maxSum);
    }

    public static int calcMaxHourglass(int[][] arr){
        int maxSum = 0;
        for(int row=0; row < size-2; row++){
            for(int column=0; column < size-2; column++){

                int currSum = arr[row][column]
                        + arr[row][column + 1] + arr[row][column + 2] + arr[row+1][column+1]
                        +arr[row+2][column] + arr[row+2][column+1] + arr[row+2][column+2];
                if(row == 0 && column == 0){
                    maxSum = currSum;
                }
                maxSum = (currSum > maxSum) ? currSum : maxSum;
            }
        }
        return maxSum;
    }

}
