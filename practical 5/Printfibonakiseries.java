import java.util.Scanner;

public class Printfibonakiseries {

    static void fibonacci(int n) {

        int n1 = 1, n2 = 1, temp;

        for (int i = 0; i < n; i++) {
            System.out.println(n1);
            temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
    }

    public static void main(String[] args) {

        int x;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter x : ");
        x = s.nextInt();

        fibonacci(x);

    }
}
