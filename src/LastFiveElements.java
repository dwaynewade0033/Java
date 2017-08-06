import java.util.ArrayList;
import java.util.List;

public class LastFiveElements {
    List<Integer> list = new ArrayList<>(5);

    public void add(Integer element) {
        list.add(element);
    }

    public List<Integer> get() {
        if(list.size() < 5) {
            return list;
        }
        return list.subList(list.size() - 5, list.size());
    }


    public static void main(String[] args) {
        LastFiveElements lastFiveElements = new LastFiveElements();
        lastFiveElements.add(4);
        lastFiveElements.add(5);
        lastFiveElements.add(6);
        lastFiveElements.add(2);
        lastFiveElements.add(6);
        lastFiveElements.add(3);
        lastFiveElements.add(8);
        lastFiveElements.add(9);
        lastFiveElements.add(7);

        System.out.println(lastFiveElements.get());

    }
}



