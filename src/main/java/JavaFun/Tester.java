package JavaFun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tester {
    public static void main(String[] args){
        BufferedReader expBr = null;
        FileReader expFr = null;

        BufferedReader outBr = null;
        FileReader outFr = null;

        try {
            expFr = new FileReader("expected.txt");
            expBr = new BufferedReader(expFr);

            outFr = new FileReader("output.txt");
            outBr = new BufferedReader(outFr);

            String expLine = "";
            String outLine = "";
            int counter = 1;
            while ( (expLine = expBr.readLine()) != null) {
                outLine = outBr.readLine();
                if(!expLine.equals(outLine))
                    System.out.println(counter);
                counter++;
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
