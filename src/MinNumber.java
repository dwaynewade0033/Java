import java.util.Arrays;

public class MinNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{2,5,3,42,6,3,1,4,1,4,0,3,2,1};
        int[] minNumbers = new int[3];

        int prevIndex;

        for (int i = 0; i < minNumbers.length; i++) {
            prevIndex = i == 0 ? 0 : i - 1;
            minNumbers[i] = numbers[i];
            for (int number : numbers) {
                if (number > minNumbers[prevIndex] && number < minNumbers[i]) {
                    minNumbers[i] = number;
                }
            }
        }

        System.out.println(Arrays.toString(minNumbers));

    }
}
