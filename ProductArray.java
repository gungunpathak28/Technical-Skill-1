import java.util.Scanner;
public class ProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int zeroCount = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zeroCount++;
            } else {
                product *= a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                p[i] = 0;
            } else if (zeroCount == 1) {
                if (a[i] == 0) {
                    p[i] = product;
                } else {
                    p[i] = 0;
                }
            } else {
                p[i] = product / a[i];
            }
        }
        System.out.println("Product array:");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }

        sc.close();
    }
}
