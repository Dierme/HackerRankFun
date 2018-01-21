package JavaFun;

public class Generics0 {
    static class Printer
    {
        //Write your code here
        public void printArray(Object[] a){
            for(Object e : a)
                System.out.println(e);
        }
    }

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

    }
}
