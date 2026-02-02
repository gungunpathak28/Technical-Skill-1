import java.util.Scanner;
public class CountElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        int countMax = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                countMax++;
            }
        }

        int result = n - countMax;

        System.out.println("Number of elements having at least one element greater than itself: " + result);

        sc.close();
    }
}
