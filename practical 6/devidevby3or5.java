import java.util.*;

public class devidevby3or5 {

    public static void main(String[] args) {

        int n, i, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a size of array : ");
        n = s.nextInt();
        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("Enter a " + i + " element : ");
            a[i] = s.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] % 3 == 0 || a[i] % 5 == 0) {
                sum = sum + a[i];
            }
        }

        System.out.println("Sum of all number which are divded by 3 or 5 is : " + sum);

    }

}
