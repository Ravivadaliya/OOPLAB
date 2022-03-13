import java.util.*;

public class GCD {

    public static void gcd(int n1, int n2) {
        int max=1;
        
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                if (max < i)
                    max = i;
            }
        }
        System.out.print("GCD of 2 number is : "+max);
    }

    public static void main(String[] args) {
        int n1, n2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number n1 : ");
        n1 = s.nextInt();
        System.out.print("Enter a number n2 : ");
        n2 = s.nextInt();

        gcd(n1,n2);
        

    }
}