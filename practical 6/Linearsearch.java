//wap to search element an array using linear search
import java.util.*;

public class Linearsearch {
    public static void main(String[] args) {

        // declaration
        int n, x;
        boolean flag = false;

        // declare a scanner for scanning value
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array n :  ");

        // scan n
        n = s.nextInt();

        // array initialization for value n
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Element " + i + " :");
            a[i] = s.nextInt();
        }

        System.out.println("Enter a element to search : ");
        x = s.nextInt();
      
        // logic
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("The element are located in : " + i);
                flag = true;
                break;
            }
        }
        if(!flag)
         System.out.println("tamara dvara dakhal karel element upar na aaray uplabdh nathi, search karva badal aapno aabhar.");

    }
}
