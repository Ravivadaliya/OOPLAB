import java.util.Scanner;
/**
 * findmaxusingmethod
 */
public class findmaxusingmethod {

    // Method
    static void findmax(int x, int y) {

        if (x > y) {
            System.out.println(x + " is a max");
        } else {
            System.err.println(y + " is a max");
        }

    }

    public static void main(String[] args) {

        // declaretion
        int a, b;

        // create s scanner for scanning value
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a two number to find maximum number : ");

        // scan a and b
        a = s.nextInt();
        b = s.nextInt();

        //call method findmax
        findmax(a,b);

    }
}