import java.util.Random;

public class MyThread extends Thread {
    public void run(){
        final int rows = 100;
        final int cols = 100;
        int[][] firsrMatrix = new int[rows][cols];

        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                firsrMatrix[i][j] = random.nextInt(10);
            }
        }

        int[][] secondMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                secondMatrix[i][j] = random.nextInt(10);
            }
        }

        int m = firsrMatrix.length;
        int n = secondMatrix[0].length;
        int o = secondMatrix.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += firsrMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }


    }

}

