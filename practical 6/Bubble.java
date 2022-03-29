//bubble sort using array

import java.util.*;

public class Bubble {

    public static void bsort(int a[], int n) {

        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

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

        for (i = 0; i < n; i++) {
            System.out.print("Element " + i + " :");
            a[i] = s.nextInt();
        }
        System.out.print("before sorted : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        bsort(a, n);
        s.close();

        System.out.print("after sorted : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
