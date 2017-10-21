import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Threads extends Thread {

    String line;
    Lock lock = new ReentrantLock();
    SetS setS = new SetS();

    public Threads(String line) {
        this.line = line;
    }

    @Override
    public void run() {

        String[] words = line.split(" ");

        for (int i = 0; i < words.length; i++) {
            setS.addToSet(words[i]);
        }
    }


}