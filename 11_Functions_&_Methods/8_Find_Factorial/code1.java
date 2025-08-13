import java.util.*;

public class code1{
    public static void factorial (int n ) {
        long factoriial = 1 ;
        for (int i = 1 ; i <= n ; i ++ ) {
            factoriial = factoriial * i ;
        }
        System.out.println (factoriial) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        factorial(n);
    }
}
