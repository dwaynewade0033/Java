public class Main {
    static MyThread myThread;
    public static void main(String[] args) {
       myThread = new MyThread();
       Thread thread = new Thread(myThread);
       thread.start();




    }
}

