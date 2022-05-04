import java.util.Scanner;

import javax.lang.model.element.Element;
import javax.swing.border.StrokeBorder;

public class Extersice {
     
    int i, store, a = 0; 
    Scanner s = new Scanner(System.in);


    //create a constracter 
    Extersice() {
        int n;
        n = (int) ((Math.random()) * 100);
        store = n;
    }

    
    void takevalue() {
        System.out.println("Enter your number : ");
        i = s.nextInt();
        a++;
    }

    void currect() {
        while (true) {

            if (store < i) {
                System.out.println("geuss number a large");
                takevalue();

            } else if (store > i) {
                System.out.println("geuss number a small");
                takevalue();
            } else {
                System.out.println("sucess , number is " + i);
                System.out.println("your score is  " + a);
                break;
            }
        }
    }

    public static void main(String[] args) {

        Extersice e = new Extersice();
        e.takevalue();
        e.currect();
    }
}