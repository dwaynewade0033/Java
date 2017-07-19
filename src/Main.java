
import java.io.IOException;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input diameter of the hole");
        int d = scanner.nextInt();
        System.out.println("Input the brick dimensions x, y , z");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        Brick brick = new Brick(x, y, z);

        System.out.println(brick.solution(x, y, z, d));

    }

}
