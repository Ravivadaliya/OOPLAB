import java.util.Scanner;

public class sumoddeven {
    public static void main(String[] args) {

        // declaration
        int n, i, sum_even = 0, sum_odd = 0;

        // declare scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value of n : ");
        n = s.nextInt();

        // array initialisation
        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("enter a " + i + " number : ");
            a[i] = s.nextInt();
        }

        // logic
        for (i = 0; i < n; i++) {
            if (a[i] >= 0 && a[i] % 2 == 0)
                sum_even = sum_even + a[i];
            if (a[i] < 0 && a[i] % 2 != 0) {
                sum_odd = sum_odd + a[i];
            }
        }
        System.out.println("sum of even or positive number is : " + sum_even);
        System.out.println("sum of odd or nagetive number is : " + sum_odd);

    }
}