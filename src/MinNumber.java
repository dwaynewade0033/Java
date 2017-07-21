import java.util.Arrays;

public class MinNumber {


    public static void main(String[] args) {
        int[] oldArray = new int[]{2, 5, 3, 42, 6, 3, 1, 4, 2, 1, 4, 3, 2, 1};
        System.out.println(Arrays.toString(oldArray));
        int[] newArray = new int[3];
        for (int i = oldArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (oldArray[j] > oldArray[j + 1]) {
                    int t = oldArray[j];
                    oldArray[j] = oldArray[j + 1];
                    oldArray[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(oldArray));


        System.out.print((newArray[0] = oldArray[0]) + "  ");
        int r = 1;
        for (int i = 1; i < oldArray.length; i++) {
            if ((oldArray[i] != oldArray[i - 1]) && r != 3)
               {
                   newArray[r] = oldArray[i];
                System.out.print(newArray[r]+ "  ");
                r++;
            }


        }
    }
}


