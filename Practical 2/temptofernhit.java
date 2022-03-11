import java.util.Scanner;

public class temptofernhit {
    public static void main(String[] args) {

        // declaration
        float f, c;

        // create a scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a temperate in faherenhit");

        // scan f
        f = s.nextFloat();

        // formula
        c = (f - 32) *(5f/9);

        System.err.println(c);

    }
}
