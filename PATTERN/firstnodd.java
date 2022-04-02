
// find odd number of given n number 
import java.util.*;

public class firstnodd {
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value of n :");
        n = s.nextInt();
        System.out.println("odd number is :");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }

    }

}
