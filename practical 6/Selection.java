
//selection sort
import java.util.*;

import javax.swing.JMenuItem;

public class selection {

    
    static int ssort(int a[], int n) {

        int minindex, temp;
        for (int i = 0; i < n - 1; i++) {
            minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minindex]) {
                    minindex = j;
                }
            }
            if (minindex != i) {
                temp = a[i];
                a[i] = a[minindex];
                a[minindex] = temp;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // declaration
        int n, i;

        // create a scanner for scanning value
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array n :  ");

        // scan n
        n = s.nextInt();

        // array initialization for value n
        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Element " + i + " :");
            a[i] = s.nextInt();
        }
        System.out.print("before sorted : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        ssort(a, n);

        System.out.print("after sorted : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
