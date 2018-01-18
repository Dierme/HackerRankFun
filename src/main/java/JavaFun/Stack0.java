package JavaFun;

import java.util.Scanner;
import java.util.Stack;

public class Stack0 {

    abstract static class Symbol{
        public static Symbol getObject(String s){
            Symbol sym = null;
            switch (s) {
                case "(":
                    sym = new Bracket();
                    break;

                case "{":
                    sym = new CurvBracket();
                    break;

                case "[":
                    sym = new SqBracket();
                    break;
            }
            return sym;
        }


        public boolean close(String s){
            throw new RuntimeException("Method has not been implemented");
        }
    }

    //says, that object in Stack is "("
    static class Bracket extends Symbol{
        @Override
        public boolean close(String s){
            return s.equals(")");
        }
    }

    //says, that object in Stack is "{"
    static class CurvBracket extends Symbol{
        @Override
        public boolean close(String s){
            return s.equals("}");
        }
    }

    //says, that object in Stack is "["
    static class SqBracket extends Symbol{
        @Override
        public boolean close(String s){
            return s.equals("]");
        }
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String line = s.nextLine();

            boolean result = lineBalancedChecker(line);
            System.out.println(result);
        }
    }

    public static boolean lineBalancedChecker(String line){

        //empty line is balanced
        boolean balanced = true;

        //stack
        Stack<Symbol> stack = new Stack<>();

        //line scanner - read symbol by symbol
        Scanner lineScan = new Scanner(line);
        lineScan.useDelimiter("");

        while (lineScan.hasNext()){
            //read next symbol
            String sread = lineScan.next();
            Symbol sym = Symbol.getObject(sread);

            if(sym == null){
                if(stack.empty()){
                    return false;
                }
                Symbol last = stack.pop();
                balanced = last.close(sread);
            }
            else
                stack.push(sym);
        }

        if(!stack.empty()){
            balanced = false;
        }

        return balanced;
    }
}
