//create class candidate and create method printdetail,
//   and print detail all condidate

import java.util.*;
import java.util.concurrent.locks.Condition;

//create class candi
class candi {
    int id;
    String name;
    int age;
    double hight;
    double weight;
    Scanner s = new Scanner(System.in);

    // create method into class

    public void getdetail() {
        System.out.println("Enter a candidate id : ");
        id = s.nextInt();

        System.out.println("Enter a candidate name : ");
        name = s.next();

        System.out.println("Enter a candidate age : ");
        age = s.nextInt();

        System.out.println("Enter a candidate hight : ");
        hight = s.nextDouble();

        System.out.println("Enter a candidate weight : ");
        weight = s.nextDouble();

    }

    // create method
    public void printdetail() {
        System.out.println("id is : " + id);
        System.out.println("id is : " + name);
        System.out.println("id is : " + age);
        System.out.println("id is : " + hight);
        System.out.println("id is : " + weight);

    }
}

// this is main method
public class Candidate {
    public static void main(String[] args) {

        // create a object and memory allocate
        System.out.println("for candidate  c1 ");
        candi c1 = new candi();// object 1
        c1.getdetail();
        c1.printdetail();

        System.out.println("for candidate  c2 ");
        candi c2 = new candi();// object 2
        c1.getdetail();
        c1.printdetail();

        System.out.println("for candidate  c1 ");
        candi c3 = new candi();// object 3
        c3.getdetail();
        c3.printdetail();

    }
}
