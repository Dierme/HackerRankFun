package JavaFun;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet0 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String[]> collection = new HashSet<>();

        for(int i = 0; i < t; i++){
            String[] pair = new String[2];
            pair[0] = pair_left[i];
            pair[1] = pair_right[i];

            if(!contains(pair, collection)){
                collection.add(pair);
            }
            System.out.println(collection.size());
        }
    }

    public static boolean contains(String[] pair, HashSet<String[]> collection){
        for (String[] p: collection) {
            if(p[0].equals(pair[0]) && p[1].equals(pair[1]))
                return true;
        }
        return false;
    }

}
