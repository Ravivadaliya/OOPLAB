import java.time.chrono.HijrahEra;
import java.util.Scanner;

class A {

    int a, b;
    Scanner s = new Scanner(System.in);

    void sum() {
        System.out.println("enter a and b : ");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("a and b is : " + a + " and " + b);
    }

    class B {
        int hight;

        void calculate() {
            System.out.println("Enter a hight");
            hight = s.nextInt();
            System.out.println("height is " + hight);
        }

        class C {

            int weight;

            void area(int weight) {
                this.weight = weight;
                System.out.println("weight is : " + weight);
            }
        }

    }
}

public class forclass {
    public static void main(String[] args) {

        A a = new A();
        a.sum();

        // C c = new C();
        // c.area(56);

    }
}
