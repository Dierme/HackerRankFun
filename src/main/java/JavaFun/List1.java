package JavaFun;

import java.util.LinkedList;
import java.util.Scanner;

public class List1 {
    public enum Mode {
        Insert("Insert"),
        Delete("Delete");

        private String val;

        Mode(String val) {
            this.val = val;
        }

        public String toString() {
            return val;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < size; i++){
            list.addLast(s.nextInt());
        }

        int qn = s.nextInt();
        s.nextLine();

        for(int i = 0; i < qn; i++){

            String mode = s.nextLine();
            String opStr = s.nextLine();
            Scanner opScan = new Scanner(opStr);
            int flag = 0;

            if(mode.equals(Mode.Insert.toString())){
                int index = opScan.nextInt();
                int value = opScan.nextInt();

                list.add(index, value);
                flag++;
            }
            if(mode.equals(Mode.Delete.toString())){
                int index = opScan.nextInt();
                list.remove(index);
                flag++;
            }

            if(flag == 0){
                throw new RuntimeException("Mode is not recognized: "+mode);
            }
            if(flag > 1){
                throw new RuntimeException("More then one recognition of mode: "+mode);
            }

        }
        for (int value:list) {
            System.out.print(value + " ");
        }
    }
}
