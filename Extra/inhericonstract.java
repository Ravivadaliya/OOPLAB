//constractor in inheritance

//super class
class A {

    A() {
        System.out.println("this is constracter A");
    }

    A(int x) {
        System.out.println("Constracter a value of x = " + x);
    }
}

//subclass
class B extends A {

    B() {
        System.out.println("this is constracter B");
    }

    B(int x, int y) {
        super(345);
        System.out.println("Constracter a value of y = " + y);
    }
}

class C extends B {

    C() {     
        System.out.println("this is constracter c");
    }

    C(int x, int y,int z) {
        super(5,6);
        System.out.println("Constracter a value of y = " + z);
    }
}



public class inhericonstract {
    public static void main(String[] args) {

        // A a = new A();
        // B b = new B();//when a B constractor are called , first  constractor are called
         C c = new C(20,30,40);

       
         

    }
}
