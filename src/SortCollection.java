import java.util.Arrays;
import java.util.List;

public class SortCollection {
    public static void main(String[] args) {
          int  n = 7;
          int first;
          int second;
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
            for (int i = 0; i < numbers.size(); i++) {
                for (int k = i + 1; k < numbers.size(); k++) {
                    first = numbers.get(i);
                    second = numbers.get(k);
                    if (first + second == n) {
                        System.out.println("Numbers " + first + " and " + second + " equals " + n);

                    }
                }
            }

    }
    }

