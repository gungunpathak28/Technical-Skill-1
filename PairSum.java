import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k && i != j) {
                    found = true;
                    System.out.println("Pair found at indices: " + i + " and " + j);
                    break;
                }
            }
            if (found)
                break;
        }

        if (!found) {
            System.out.println("No such pair exists");
        }

        sc.close();
    }
}
