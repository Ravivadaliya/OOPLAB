import java.util.*;

import javax.sound.sampled.SourceDataLine;

//create class
class Bank_account {
    // declaration
    long accountno;
    String username;
    String email;
    String accounttype;
    double balance;

    // declare scanner
    Scanner s = new Scanner(System.in);

    // create method
    public void Getaccountdetail() {
        System.out.print("Enter account number : ");
        accountno = s.nextLong();

        System.out.print("Enter username : ");
        username = s.next();

        System.out.print("Enter emailid : ");
        email = s.next();

        System.out.print("Enter account type : ");
        accounttype = s.next();

        System.out.print("Enter account balance : ");
        balance = s.nextDouble();

    }

    public void Displayaccountdetail() {
        System.out.println("Account no is :" + accountno);
        System.out.println("User name is : " + username);
        System.out.println("Emai_id  is " + email);
        System.out.println("Account type is : " + accounttype);
        System.out.println("Account balance is : " + balance);

    }
}

// main class
public class Baccount {

    // main method
    public static void main(String[] args) {

        // create object and memory allocate
        System.out.println("for b1 : ");
        Bank_account b1 = new Bank_account();// object 1

        // method call for object b1
        b1.Getaccountdetail();
        b1.Displayaccountdetail();

        System.out.println("for b2 : ");
        Bank_account b2 = new Bank_account();// object 2

        // method call for object b2
        b2.Getaccountdetail();
        b2.Displayaccountdetail();

        System.out.println("for b3 : ");
        Bank_account b3 = new Bank_account();// object 3

        // method call for object b3
        b3.Getaccountdetail();
        b3.Displayaccountdetail();

        System.out.println("for b4: ");
        Bank_account b4 = new Bank_account();// object 4
        
        // method call for object b4
        b4.Getaccountdetail();
        b4.Displayaccountdetail();
    }
}
