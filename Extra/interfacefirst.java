import java.util.Scanner;

import javax.sound.midi.Soundbank;

interface i1 {
    int x = 50;

    void start();

    void speed();

    private void work() {
        System.out.println("all system are work in thermodynamic rule");
    }

    default void enginesize() {
        work();
        System.out.println("2200 HP");
    }

}

interface i2 {
    int v = 33000;
    int r = 344;

    void produceelctricity();

    void distribute();

    private void producejoule() {
        System.out.println("Produce electricity in megavolt is : " + v);
    }

    default void show() {
        producejoule();
        System.out.println("Electric register is : " + r);
    }
}

class all implements i1, i2 {

    // for interface i1
    public void start() {
        System.out.println("press key");
    }

    public void speed() {
        System.err.println("speed is " + x);
    }

    all() {
        System.out.println();

    }

    // for interface i2
    public void produceelctricity() {
        System.out.println("Produce elcricity are in Baroda,Ahmedabad,Narmada,Area of near in sea");
    }

    public void distribute() {
        System.out.println("Distribute electricity are all gujrat and mumbai");
    }

}

public class interfacefirst {
    public static void main(String[] args) {

        all a = new all();

        System.out.println("For car");
        a.start();
        a.speed();
        a.enginesize();

        System.out.println();
        System.out.println("For electricity : ");
        a.produceelctricity();
        a.distribute();
        a.show();

    }
}
