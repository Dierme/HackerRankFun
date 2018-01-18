package JavaFun;

import org.junit.Assert;
import org.junit.Test;

public class Stack0Tests {
    @Test
    public void balancedTrivial(){
        String line = "{}()";
        Assert.assertEquals(true, Stack0.lineBalancedChecker(line));
    }

    @Test
    public void unbalancedTrivial(){
        String line = "}{}()";
        Assert.assertEquals(false, Stack0.lineBalancedChecker(line));
    }

    @Test
    public void unbalancedInsideBalanced(){
        String line = "{}}}{}";
        Assert.assertEquals(false, Stack0.lineBalancedChecker(line));
    }

    @Test
    public void longBalanced(){
        String line = "{}{{{}}}{{{((()))}}}";
        Assert.assertEquals(true, Stack0.lineBalancedChecker(line));
    }

    @Test
    public void longUnBalanced(){
        String line = "{}()))(()()({}}{}";
        Assert.assertEquals(false, Stack0.lineBalancedChecker(line));
    }

}
