import java.util.*;


//create class
class employee{
    // declaration
    int id;
    String name;
    String designation;
    int  age;
    double salary;

    // declare scanner
    Scanner s = new Scanner(System.in);

    // create method
    public void Getemployeedetail() {
        System.out.print("Enter employee id : ");
        id = s.nextInt();

        System.out.print("Enter employee name  : ");
        name = s.next();

        System.out.print("Enter designation : ");
        designation = s.next();

        System.out.print("Enter employee age : ");
        age = s.nextInt();

        System.out.print("Enter employee salary : ");
        salary = s.nextDouble();

    }

    public void Displayemployeedetail() {
        System.out.println("Employee id is :" +id);
        System.out.println("Employee name is : " +name);
        System.out.println("Employee designation is " +designation);
        System.out.println("Employee aage is  : " +age);
        System.out.println("Employee salary is : " +salary);

    }
}

public class FOREMPLOYEE {

    // main method
    public static void main(String[] args) {

        // create object and memory allocate
        System.out.println("for e1 : ");
        employee e1 = new employee(); //object 1
        e1.Getemployeedetail();
        e1.Displayemployeedetail();

        System.out.println("for e2 : ");
        employee e2 = new employee(); //object 2
        e2.Getemployeedetail();
        e2.Displayemployeedetail();

        System.out.println("for e3 : ");
        employee e3 = new employee(); //object 3
        e3.Getemployeedetail();
        e3.Displayemployeedetail();

        System.out.println("for e4: ");
        employee e4 = new employee();
        e4.Getemployeedetail();
        e4.Displayemployeedetail();
    }
}
