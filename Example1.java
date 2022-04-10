import java.util.Scanner;

import javax.crypto.Cipher;
import javax.management.relation.RoleResult;
import javax.naming.spi.DirStateFactory.Result;
import javax.xml.transform.Templates;

//first class
class student {

   //declaratioon
   long enroll_no;
   String Sname;
   int sem;
   Scanner s = new Scanner(System.in);

   //create a method to enter detail of student 
   void getstudentdetail() {
      
      System.out.println();
      System.out.println("Student detail : ");
      System.out.println();
      System.out.println("Enter a enroll no : ");
      enroll_no = s.nextLong();
      System.out.println("Enter a student name : ");
      Sname = s.next();
      System.out.println("Enter student sem : ");
      sem = s.nextInt();
      
   }
}

// second class
class result {
   
   //declaration
   float cpi, spi;
   int backlog,kt;
   
   Scanner sc = new Scanner(System.in);
   //create a method to enter result detail for student 
   void getresultdetail() {

      System.out.println();
      System.out.println("result detail : ");
      System.out.println();
      System.out.println("Enter cpi : ");
      cpi = sc.nextFloat();
      System.out.println("Enter spi : ");
      spi = sc.nextFloat();
      System.out.println("Enter backlog : ");
      backlog = sc.nextInt();
      System.out.println("Enter kt : ");
      kt = sc.nextInt();
   }

   //create a method to get detail of preticular student 
   public void displaydetail(student s[], int i) {
      System.out.println("enroll_no is : " + s[i].enroll_no);
      System.out.println("Name is : " + s[i].Sname);
      System.out.println("sem is : " + s[i].sem);
      System.out.println("cpi is : " + cpi);
      System.out.println("spi is : " + spi);
      System.out.println("backlog is : " + backlog);
      System.out.println("kt is : " + kt);
   }

}

//main class
public class Example1 {
   public static void main(String[] args) {

      //declaration
      int n;
      long enroll_no;

      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number of student : ");
      n = input.nextInt();

     
      // cretae array using object
      student s[] = new student[n];
      result r[] = new result[n];

      for (int i = 0; i < n; i++) {
         s[i] = new student();
         r[i] = new result();
         s[i].getstudentdetail();
         r[i].getresultdetail();
      }

      while (true) {
         System.out.println("Chooce the any one following ");
         System.out.println();
         System.out.println("Enter a -1 to close loop : ");
         System.out.print("Enter a enrollment number to get detail -> ");
         enroll_no = input.nextLong();

         for (int i = 0; i < n; i++) {
            if (enroll_no == s[i].enroll_no) {
               r[i].displaydetail(s, i);
            }
         }
         if (enroll_no == -1) {
            break;
         }
      }
   }
}
