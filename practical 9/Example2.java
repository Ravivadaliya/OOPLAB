import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.crypto.Cipher;
import javax.management.relation.RoleResult;
import javax.naming.spi.DirStateFactory.Result;
import javax.xml.transform.Templates;

//first class
class student {

    // declaratioon
    long enroll_no;
    String Sname;
    int sem;
    float cpi;
    Scanner s = new Scanner(System.in);

    // create a method to enter detail of student
    void getstudentdetail() {

        System.out.println();
        System.out.println("Enter a enroll no : ");
        enroll_no = s.nextLong();
        System.out.println("Enter a student name : ");
        Sname = s.next();
        System.out.println("Enter student sem : ");
        sem = s.nextInt();
        System.out.println("Enter student cpi : ");
        cpi = s.nextFloat();

    }

    // create a method to print detail for student
    void printdetail() {
        System.out.println();
        System.out.println("enroll no : " + enroll_no);
        System.out.println("name : " + Sname);
        System.out.println("cpi: " + cpi);
        System.out.println(" sem : " + sem);
    }

}

// main class
public class Example2 {
    public static void main(String[] args) {

        // declaration
        int n, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of student : ");
        n = sc.nextInt();

        // cretae array using object
        student s[] = new student[n];

        // this loop are create object and call method to perticular student
        for (i = 0; i < n; i++) {
            System.out.print("Enter a detail of student " + (i + 1) + " :");
            s[i] = new student();
            s[i].getstudentdetail();
        }

        // call method and print detail
        for (i = 0; i < n; i++) {
            s[i].printdetail();
        }

    }
}
