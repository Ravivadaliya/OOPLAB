import java.util.Scanner;

public class simpleinterst {

    static void interest(double amount, double year, double anualrate) {

        double interest;

        // calculate simple interest
        interest = amount * year * (anualrate/100);
        System.out.println("simple interest is : " + interest);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a amount : ");
        double amount = s.nextDouble();

        System.out.print("enter a year : ");
        double year = s.nextDouble();

        System.out.print("Enter anual rate : ");
        double anualrate = s.nextDouble();

        interest(amount, year, anualrate);
    }
}
