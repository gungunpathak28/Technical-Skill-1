import java.util.Scanner;
public class LowerDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int sum = 0;
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        if (cols == rows) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (j > i) {   
                        sum += matrix[j][i];
                    }
                }
            }
            System.out.println("Sum of lower diagonal elements: " + sum);
        } else {
            System.out.println("Lower diagonal not possible ");
        }

        sc.close();
    }
}

