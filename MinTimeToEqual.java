import java.util.Scanner;
public class MinTimeToEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int time = 0;
        for (int i = 0; i < n; i++) {
            time += (max - a[i]);
        }
        System.out.println("Minimum time required: " + time + " seconds");

        sc.close();
    }
}
