import java.util.Scanner;

public class reverce {

    public static void main(String[] args) {

        //declaration
        int n, reverce = 0;
        int i;

        Scanner s = new Scanner(System.in);
        System.out.print("enter a vaule n :");
        n = s.nextInt();

        while (n != 0) {
            i = n % 10;
            reverce = reverce * 10 + i;
            n = n / 10;
        }

        System.out.println(reverce);

    }
}
