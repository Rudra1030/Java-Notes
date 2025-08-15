import java.util.*;

public class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimesInRange(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (start and end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.print("Prime numbers between " + start + " and " + end + ": ");
        printPrimesInRange(start, end);

        scanner.close();
        System.out.println();
    }
}
