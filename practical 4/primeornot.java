// chrck number a prime or not
import java.util.*;

public class primeornot {
    public static void main(String[] args) {
        int n;
        boolean flag = false;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to check a prime or not : ");
        n = s.nextInt();
             
              for (int i = 2; i <n; ++i) {
                
                if (n % i == 0) {
                  flag = true;
                  break;
                }
              }
          
              if (!flag)
                System.out.println(n + " is a prime number.");
              else
                System.out.println(n + " is not prime number.");
          
    }
}
