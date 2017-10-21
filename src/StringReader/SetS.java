import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class SetS {

    static Set<String> set = new HashSet<>();
    Lock lock = new ReentrantLock();


    public static Set<String> getSet() {
        return set;
    }

    synchronized static void addToSet(String word) {
        set.add(word);

    }

}
