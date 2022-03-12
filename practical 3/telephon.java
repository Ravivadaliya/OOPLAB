import java.util.*;

public class telephon {
    public static void main(String[] args) {

        int noofcalls;
        double bill;

        Scanner s = new Scanner(System.in);
        System.out.print("enter a number of calls : ");
        noofcalls = s.nextInt();

        if (noofcalls < 100) {
            bill = 200;
        } else if (noofcalls > 100 && noofcalls <= 150) {
            bill = 200 + (0.60 * (noofcalls - 100));
        }

        else if (noofcalls > 150 && noofcalls <= 200) {
            bill = 200 + (0.60 * 50) + (0.50 * (noofcalls - 150));
        } else {
            bill = 200 + (0.60 * 50) + (0.50 * 50) + (0.40 * (noofcalls - 200));
        }

        System.err.println("total billamount : " + bill);
    }
}
