import java.util.*;

import javax.xml.transform.Source;

//create class
class Member {
    String name, address;
    int age, salary;
    long phonno;

    void printsalary() {
        System.out.println("salary is : " + salary);
    }

}

// create subclass employee with extends member
class employee extends Member {
    String specialization;

    // constructors
    employee(int salary) {
        this.salary = salary;
    }

    // create a method for print employee detail
    void printemployeedetail() {
        System.out.println("Employee detail :");
        System.out.println("Employee name is :" + name);
        printsalary();
        System.out.println("Employee age is :" + age);
        System.out.println("Employee phono is :" + phonno);
        System.out.println("Employee address is :" + address);
        System.out.println("Employee specialization is :" + specialization);
    }
}

// create sub class manager with extends member
class manager extends Member {
    String department;

    // constructors
    manager(int salary) {
        this.salary = salary;
    }

    // create a method for print manager detail
    void printmanagerdetail() {
        System.out.println("manager detail :");
        System.out.println("manager name is :" + name);
        printsalary();
        System.out.println("manager age is :" + age);
        System.out.println("manager phono is :" + phonno);
        System.out.println("manager address is :" + address);
        System.out.println("manager department is :" + department);
    }
}

public class Example1 {

    public static void main(String[] args) {

        // create object for both class and define salary with peramiterize constructors
        employee e1 = new employee(45000);
        manager m1 = new manager(55000);

        // detail of e1
        e1.name = "mayur";
        e1.age = 24;
        e1.phonno = 909997;
        e1.address = "ahmedabad";
        e1.specialization = "finance";
        e1.printemployeedetail();

        System.out.println();

        // detail of m1
        m1.name = "manish";
        m1.age = 28;
        m1.phonno = 764594;
        m1.address = "rajkot";
        m1.department = "HR";
        m1.printmanagerdetail();

    }
}