
//write a program tofind maximum number of given n number 
import java.util.*;

public class findmax {
  public static void main(String[] args) {

    // declaration
    int n, max;

    // create scanner

    Scanner s = new Scanner(System.in);
    System.out.println("enter size of array : ");

    // scan n
    n = s.nextInt();

    // array declaretion and must be specify with n
    int a[] = new int[n];

    System.out.println("enter a element of array : ");
    for (int i = 1; i <= n; i++) {
      System.out.print("Enter "+i+" element");
      a[i] = s.nextInt();
    }

    max = a[0];
    for (int i = 0; i < n; i++) {
      if (max < a[i]) {
        max = a[i];
      }
    }
    System.out.println("Maximum value is :" + max);

  }
}
