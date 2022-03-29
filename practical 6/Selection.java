
//bubble sort
import java.util.*;

import javax.swing.JMenuItem;
import javax.xml.transform.Source;

//using class and objecct selection sort 
class ravi {
    private int minindex, temp;

    void sort(int a[], int n) {

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
    }
}

// main class
public class Selection {

    // inner main class method (static type)
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

    // main method
    public static void main(String[] args) {

        // declaration
        int n, i;

        // declare a scanner for scanning value
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array n :  ");

        // scan n
        n = s.nextInt();

        // array initialization for value n
        int a[] = new int[n];

        // enter a elemenet
        for (i = 0; i < n; i++) {
            System.out.print("Element " + i + " :");
            a[i] = s.nextInt();
        }

        // close s
        s.close();

        System.out.print("before sorted : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        // method call (Static type-inner class)
        ssort(a, n);

        // after call print array
        System.out.print("After sorted : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        // using object method call
        ravi r1 = new ravi();
        r1.sort(a, n);

        System.out.println();

        System.out.print("Using object : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
       

    }
}
