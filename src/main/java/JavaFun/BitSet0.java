package JavaFun;

import java.util.BitSet;
import java.util.Scanner;

public class BitSet0 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.*/

        Scanner scan = new Scanner(System.in);

        //set site
        int n = scan.nextInt();

        //number of operations
        int nOper = scan.nextInt();

        BitSet[] bSets = new BitSet[2];
        bSets[0] = new BitSet(n);
        bSets[1] = new BitSet(n);

        for(int i = 0; i < nOper; i++){
            String oper = scan.next();
            int ind1 = scan.nextInt();
            int ind2 = scan.nextInt();
            //scan.nextLine();

            switch (oper){
                case "AND":
                    bSets[ind1 - 1].and(bSets[ind2 - 1]);
                    break;
                case "SET":
                    bSets[ind1 - 1].set(ind2);
                    break;
                case "FLIP":
                    bSets[ind1 - 1].flip(ind2);
                    break;
                case "OR":
                    bSets[ind1 - 1].or(bSets[ind2 - 1]);
                    break;
                case "XOR":
                    bSets[ind1 - 1].xor(bSets[ind2 - 1]);
                    break;
                default:
                    throw new RuntimeException("Unrecognized operation: "+oper);

            }

            System.out.print(bSets[0].cardinality() + " ");
            System.out.println(bSets[1].cardinality());

        }
        scan.close();
    }
}
