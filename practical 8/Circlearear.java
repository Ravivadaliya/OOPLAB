// practical 8 
//  ex-1

import java.util.*;

class Findareaperimeter {
    double r, area;
    double pi = 3.14, perimeter;
    Scanner s = new Scanner(System.in);

    // create a method to get value form user
    public void getvalue() {
        System.out.println("Enter a radias of circle : ");
        r = s.nextFloat();
    }

    // create a method to calculate area and perimeter
    public void findareaandperi() {
        area = pi * r * r;
        perimeter = 2 * pi * r;

    }

    // print area and perimeter
    public void printvalue() {
        System.out.println("area of circle is : " + area);
        System.out.println("perimeter of circle is : " + perimeter);
    }
}


//main class
public class Circlearear {

    //main method
    public static void main(String[] args) {

        //create object and memory allocated for object
        Findareaperimeter c = new Findareaperimeter();
        // method call
        c.getvalue();
        c.findareaandperi();
        c.printvalue();

    }
}
