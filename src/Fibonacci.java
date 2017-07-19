public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(recursive(10));
    }
    public static int recursive ( int element){

        if (element == 0) {
            return 0;
        }
        if (element == 1) {
            return 1;
        } else {
            return recursive(element - 1) + recursive(element - 2);
        }
    }
}
