
import java.util.Scanner;

public class largeNumber {
    // find the large number in an array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int i = 0;
        while (i < n) {
            if (max < arr[i]) {
                max = arr[i];

            }
            i++;
        }
        System.out.println("the large number of array:" + max);
    }
}