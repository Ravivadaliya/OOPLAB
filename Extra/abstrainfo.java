//when abstract method declare in class, reqired to declare class abstract
abstract class vehical {
    int nooftires;

    // declare abstract method without body
    abstract void start();
}

// when any class inherit to abstract class , then reqired to write method(abstrat method)
// notice-> we will not create object of abstract class
class car extends vehical {

    void start() {
        System.out.println("Start with key");
    }
}

class bike extends vehical {
    void start() {
        System.out.println("Start with kike");
    }
}

public class abstrainfo {
    public static void main(String[] args) {

        car c1 = new car();
        bike b1 = new bike();

        c1.start();
        b1.start();

    }
}
