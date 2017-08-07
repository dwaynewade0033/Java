import java.util.ArrayList;
import java.util.List;

public class LastFiveElementException  {
    List<Integer> list = new ArrayList<>(5);

    public void add(Integer element) {
        list.add(element);
    }

    public List<Integer> get() throws ElementsNotFoundException {
        if(list.size() < 5) {
            throw new ElementsNotFoundException("Element not found");
        }
        return list.subList(list.size() - 5, list.size());
    }


    public static void main(String[] args) throws ElementsNotFoundException {
        LastFiveElementException lastFiveElements = new LastFiveElementException();
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


