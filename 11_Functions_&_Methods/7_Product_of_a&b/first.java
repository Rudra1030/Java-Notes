import java.util.*; // fixed semicolon

public class first {
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The answer is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        first obj = new first(); // create object to call non-static method
        obj.multiplication(a, b);
    }
}
