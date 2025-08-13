import java.util.*;

public class code{
    public static int fact(int n){
        if(n==0){
        return 1;
        }
        else{
            int factorial = 1;
            for(
                int i=1;i<=n;i++){
                    factorial = factorial * i;
        }
    return factorial;
    }
}
    public static void binfact(int n, int r){
        int factn = fact(n);
        int factr = fact(r);
        int factnr = fact(n-r);
        System.out.println("The result is: " + factn/(factr*factnr));
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        binfact(n,r);
    }
}
