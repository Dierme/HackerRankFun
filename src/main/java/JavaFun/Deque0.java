package JavaFun;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Deque0 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> llist = new LinkedList<>();
        int n = in.nextInt();
        int m = in.nextInt();

        //amount of unique numbers in current subarray
        Set<Integer> uniqueSet = new HashSet<>();

        //max amount of unique numbers in all subarrays
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            if(llist.size() >= m) {
                int removed = llist.removeLast();

                if(!llist.contains(removed))
                    uniqueSet.remove(removed);
            }

            uniqueSet.add(num);
            llist.addFirst(num);

            int unique = uniqueSet.size();
            if(unique > maxUnique)
                maxUnique = unique;
        }

        System.out.println(maxUnique);
    }
}
