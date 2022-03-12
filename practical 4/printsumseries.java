import java.util.*;

/**
 * printseries
 */
public class printsumseries {

    public static void main(String[] args) {

        int n;
        double sum = 0;
        Scanner s = new Scanner(System.in);
        System.err.print("enter a vaulue n :");
        n = s.nextInt();
        for (int i = 1; i <=n; i++) {
            sum = sum + 1.0/i;
        }
        System.out.println(sum);

    }
}