package JavaFun;

import org.junit.Assert;
import org.junit.Test;

public class Calendar1Test {

    @Test
    public void testGetDayReturnsCorrectDay()
    {
        String day = Calendar1.getDay("07","07","1995");
        Assert.assertEquals("FRIDAY", day);
    }
}
