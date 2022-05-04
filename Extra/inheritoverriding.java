class A {
    int a;

    public int meth1() {
        return 5;
    }

    public void meth2() {
        System.out.println("Class A method 2");
    }
}

class B extends A {
     @Override
    public void meth2() {
        System.out.println("class B method 2");
    }

    public void meth3() {
        System.out.println("class B method 3");

    }

}
public class inheritoverriding {
    public static void main(String[] args) {

        A a =new A();
        B b = new B();
    
        a.meth2();
        b.meth2();


    }
}
