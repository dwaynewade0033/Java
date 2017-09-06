import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void testExample() {
        List<String> myTest = new ArrayList<String>();
        myTest.add("Hello");
        myTest.add("Javaa");
        Main main = new Main();
        List<Integer> list = main.testMain(myTest);
        assertEquals(list, list);


    }
}
