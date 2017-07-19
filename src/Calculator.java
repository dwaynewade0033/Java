import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
            throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: " );
int a = scanner.nextInt();
int b = scanner.nextInt();
 int d = a - b;
        System.out.println("The difference of 2 numbers: "+ d);

    }
}