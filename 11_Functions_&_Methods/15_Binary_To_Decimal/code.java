import java.util.*;

public class code {
    public static int binaryToDecimal(int binary){
        int decimal = 0;
        int pow = 0;
        while(binary > 0) {
            int lastdigit = binary % 10;
            decimal = decimal + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            binary = binary / 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal equivalent: " + decimal);
    }
}
