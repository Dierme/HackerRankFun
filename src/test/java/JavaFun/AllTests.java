package JavaFun;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        Array1Tests.class,
        Calendar1Test.class,
        StaticInitTests.class,
        SubArray0Tests.class,
        ArrayList0Tests.class,
        Array2Tests.class})

public class AllTests{

}
