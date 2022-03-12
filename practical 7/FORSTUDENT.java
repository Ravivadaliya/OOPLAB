import java.util.*;

//create class
class student{
    // declaration
    long enrollmentno;
    String sname;
    int semester;
    float  cpi;
    float spi;
   

    // declare scanner
    Scanner s = new Scanner(System.in);

    // create method
    public void getstudentdetail() {
        System.out.print("Enter student enrollment no : ");
        enrollmentno = s.nextLong();

        System.out.print("Enter student name  : ");
        sname = s.next();

        System.out.print("Enter student semester : ");
        semester = s.nextInt();

        System.out.print("Enter student cpi : ");
        cpi = s.nextFloat();

        System.out.print("Enter student spi : ");
        spi = s.nextFloat();

    }

    public void displaystudentdetail() {
        System.out.println("student enrollment no is :" +enrollmentno);
        System.out.println("student name is : " +sname);
        System.out.println("student semester is " +semester);
        System.out.println("student cpieis  : " +cpi);
        System.out.println("student spi is : " +spi);

    }
}

public class FORSTUDENT{

    // main method
    public static void main(String[] args) {

        // create object and memory allocate
        System.out.println("for s1 : ");
        student s1 = new student(); //object 1
        s1.getstudentdetail();
        s1.displaystudentdetail();
    }
}
