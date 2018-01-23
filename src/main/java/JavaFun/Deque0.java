package JavaFun;

import java.util.LinkedList;
import java.util.Scanner;

public class Deque0 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> llist = new LinkedList<>();
        int n = in.nextInt();
        int m = in.nextInt();

        //amount of unique numbers in current subarray
        int unique = 0;

        //max amount of unique numbers in all subarrays
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            if(llist.size() >= m) {
                int removed = llist.removeLast();

                if(!llist.contains(removed))
                    unique--;
            }

            if(!llist.contains(num))
                unique++;

            llist.addFirst(num);

            if(unique > maxUnique)
                maxUnique = unique;
        }

        System.out.println(maxUnique);
    }
}
