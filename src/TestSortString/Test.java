import java.util.Arrays;
import java.util.Comparator;

import static junit.framework.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void TestMain() {
        String[] words = {"qwje", "few", "dsewf"};
        Comparator<String> stringComparator = new Main.StringSort();
        for (String str : words) {
            System.out.println(str);
        }
        Arrays.sort(words, stringComparator);
        for (String str : words) {
            System.out.println(str);
        }
        assertEquals(words.length, 3 );
    }

}
