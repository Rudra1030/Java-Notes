import java.util.*;

public class code {
    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int pow = 0;
        while (decimal > 0) {
            int lastDigit = decimal % 2;
            binary = binary + (lastDigit * (int)Math.pow(10, pow));
            pow++;
            decimal = decimal/2 ;
        }
        return binary;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int binary = decimalToBinary(decimal);
        System.out.println("Binary equivalent: " + binary);
    }
}