import java.util.*;

public class GCD {
    public static void main(String[] args) {
        int n1, n2;
        int i, j,k;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number n1 : ");
        n1 = s.nextInt();
        System.out.print("Enter a number n2 : ");
        n2 = s.nextInt();
        int max = 1;
        for (i = 1; i <= n1 && i<=n2; i++) {
            if (n1 % i== 0 && n2 %i==0) {
              if(max<i)
                  max=i;
            }
        }
        System.out.print("GCD of given 2 number is : "+max);
        
    }
}
