package JavaFun;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayList0Tests {

    public ArrayList<String> list;

    public ArrayList0Tests(){
        list = new ArrayList<>();

        //lines are hardcoded in tests
        String s1 = "5 7 9";
        String s2 = "51 71 91";

        list.add(s1);
        list.add(s2);
    }

    @Test
    public void searchReturnsCorrectElement(){

        int r1 = ArrayList0.search(list,0, 0);
        int r2 = ArrayList0.search(list, 2, 1);

        Assert.assertEquals(5, r1);
        Assert.assertEquals(91, r2);
    }

    @Test(expected = NoSuchElementException.class)
    public void searchThrowsExWhenNoSuchElementInString(){
        //only 3 elements, but we cal #5
        int r1 = ArrayList0.search(list,5, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void searchThrowsExWhenNoSuchLineInArrayList(){
        //only two lines, but we call #3
        int r1 = ArrayList0.search(list,2, 3);
    }
}
