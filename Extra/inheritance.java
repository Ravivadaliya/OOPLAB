class demo {

    int i, j;

    void add() {
        System.out.println("i + j = " + i + " " + j);
    }
}

// this class all the features are access of first class
// because we ectends first class in second class
class demo2 extends demo {

    int k;

    void showk() {
        System.out.println("k is = " + k);
    }

    void sum() {
        System.out.println("i+j+k = " + (i + j + k));
    }
}

class demo3 extends demo2 {
    int r;

    void show123() {
        System.out.println("i+j+k = " + (i + j + k + r));
    }
}

//main class
public class inheritance {
    //main class
    public static void main(String[] args) {

        demo d1 = new demo();
        demo2 d2 = new demo2();
        demo3 d3 = new demo3();

        
        // for first object
        d1.i = 10;
        d1.j = 20;
        d1.add();
        
        System.out.println();

        // second object access to all the perameter of first class
        // and declare a value
        d2.i = 25;
        d2.j = 30;
        d2.k = 50;

        // method call of first class using second object
        d2.add();

        // call second class method using second object
        d2.showk();
        d2.sum();

        
        d3.i = 25;
        d3.j = 30;
        d3.k = 50;
        d3.r = 100;

        d3.show123();
    }
}
