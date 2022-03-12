//java packages
import java.util.*;

//class declare
class Time {
    int h1, h2, addhour;
    int m1, m2, addminute;

    // declare scanner
    Scanner s = new Scanner(System.in);

    public void gettime() {

        // enter first time
        System.out.println("For time 1 :");
        System.out.print("Enter a hour : " + h1);
        h1 = s.nextInt();

        System.out.print("Enter a minute : " + m1);
        m1 = s.nextInt();

        // enter second time
        System.out.println("for time 2 :");
        System.out.print("Enter a hour : " + h2);
        h2 = s.nextInt();

        System.out.print("Enter a minute : " + m2);
        m2 = s.nextInt();
    }

    // this is return type method,
    // this is return value of minute and hour
    public int additionreturn() {
        if (m1 > 60) {
            h1 = h1 + 1;
        } else {
            return m1;
        }

        if (m2 > 60) {
            h2 = h2 + 1;
        } else {
            return m2;
        }
        return h1 + h2;
    }

    // for calculate hour and minute
    public void calculate() {
        addminute = m1 + m2;
        addhour = h1 + h2;
        if (addminute > 60) {
            addhour = addhour + 1;
            addminute = addminute - 60;
        }

    }

    //print a total hour and minute
    public void printtime() {
        System.out.println("total of time 1 and time 2 is " + addhour + " h and " + addminute + " minute. ");
    }
}

//main class
public class Timedemo {
    public static void main(String[] args) {

        // create object
        Time t1 = new Time();

        // method call
        t1.gettime();
        t1.additionreturn();
        t1.calculate();
        t1.printtime();

    }
}
