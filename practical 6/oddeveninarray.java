import java.util.Scanner;

/**
 * oddeveninarray
 */
public class oddeveninarray {

    public static void main(String[] args) {

        // declaration
        int n, oddsum = 0, evensum = 0;

        // declar scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Enter asize of array: ");

        // scan n
        n = s.nextInt();

        // initialize array
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter  " + i + " element :");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evensum++;
            } else {
                oddsum++;
            }
        }
            System.out.println("total even number is : " + evensum);
            System.out.println("tootalof  number is : " + oddsum);
        

    }
}