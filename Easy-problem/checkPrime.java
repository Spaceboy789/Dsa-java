import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n + " is the not prime.");

        }
        int count = 0;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(n + " is prime number.");
        } else {
            System.out.println(n + " is the not prime.");
        }
        in.close();
    }
}
