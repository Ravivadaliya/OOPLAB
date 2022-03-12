import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
         int n,fact=1;
         Scanner s = new Scanner(System.in);
          System.out.print("Enter a number a find factorial : ");
          n = s.nextInt();

          for(int i=1; i<=n; i++){
               fact=fact*i;
          }
          System.out.println(fact);
    }
}
