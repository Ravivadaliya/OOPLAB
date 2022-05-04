import java.util.Scanner;

class A {

    void read() {
        System.out.println("claas a display");
    }
}

class B extends A {

    void read() {
        System.out.println("class B write");
    }
}

class C extends A {
    void read() {
        System.out.println("class c read");
    }
}

public class Dynamicmethoddispatch {
    public static void main(String[] args) {

        int n;
        A a = new A();
        B b = new B();
        C c = new C();

        //using refrance r of parant class
        A r;

        //dynamic memory dispatch
            r = a;
            r.read();
    
            r = b;
            r.read();
            
            r = c;
            r.read();

    }
}
