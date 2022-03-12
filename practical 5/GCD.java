import java.util.*;

public class GCD {
    public static void main(String[] args) {
        int n1, n2;
        int i, j, r=1;
        boolean flag = false;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number n1 : ");
        n1 = s.nextInt();
        System.out.print("Enter a number n2 : ");
        n2 = s.nextInt();

        for (i = 2; i <= n1 || i<n2; i++) {
            for (j = 2;j<i; j++){
                if(i % j==0){
                    flag=true;
                }
            }
            if(!flag && n1%i==0 && n2%i==0){
                  r = r*i;  
            }
        }
        System.out.println("gcd is "+r);
        System.out.println();

    }
}
