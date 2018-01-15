package JavaFun;

import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayInputStream;

public class StaticInitTests{

    @Test
    public void testStaticInit()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("4 3".getBytes());
        System.setIn(in);
        Assert.assertEquals(12, StaticInitBlocks.area);
    }
}
