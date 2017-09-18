import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        String myString = "Morchella rufobrunnea, the blushing morel, is a sac fungus in the family Morchellaceae. A prized edible species, ";
        String myString2 = "the fungus was first described in 1998 by mycologists Gastón Guzmán and Fidel Tapia from collections made in ";
        String myString3 = "habitat preferences, the color and form of the fruit body, the lack of a sinus at the attachment of the cap ";

        Thread thread1 = new MyThread(myString, words);
        Thread thread2 = new MyThread(myString2, words);
        Thread thread3 = new MyThread(myString3, words);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(words.size());

    }
}
