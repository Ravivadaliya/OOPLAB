import java.util.Scanner;

public class pnusingmethod {
    static void primeornot(int n) {
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not: ");
        n = s.nextInt();
        primeornot(n);
    }
}
