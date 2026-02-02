import java.util.Scanner;
public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += a[i];
        }
        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - a[i];

            if (leftSum == rightSum) {
                count++;
            }

            leftSum += a[i];
        }

        System.out.println("Number of equilibrium indices: " + count);

        sc.close();
    }
}
