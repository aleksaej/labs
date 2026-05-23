import java.util.Random;

public class App {

    public static void main(String[] args) {

        System.out.println("Розробник: Уколов О.Д.");
        System.out.println();

        int[][] A = new int[3][2];

        Random random = new Random();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Матриця A:");

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = 0;

        for (int i = 0; i < A.length; i++) {

            int sum = 0;

            for (int j = 0; j < A[i].length; j++) {
                sum += A[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxRowIndex = i;
            }
        }

        int[] B = new int[A[maxRowIndex].length];

        for (int i = 0; i < B.length; i++) {
            B[i] = A[maxRowIndex][i];
        }

        System.out.println();
        System.out.println("Масив B:");

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + "\t");
        }

        System.out.println();
        System.out.println("Максимальна сума = " + maxSum);
    }
} 