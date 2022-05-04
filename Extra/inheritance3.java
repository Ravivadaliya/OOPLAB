class truct {
    private int wheel;
    private int height;

    //getter and seteer for wheel 
    public int getwheel() {
        return wheel;
    }

    public void setwheel(int wheel) {
        this.wheel = wheel;
    }

    //getter and setter for  height
    public int getheight() {
        return height;
    }

    public void setheight(int height) {
        this.height = height;
    }
}

class bike extends truct {

    int capacity;

    public int getcapacity() {
        return capacity;
    }

    public void setcapacity(int capacity) {
        this.capacity = capacity;
    }

}

public class inheritance3 {
    public static void main(String[] args) {

        // create object for truct

        truct t = new truct();
        t.setheight(30);
        System.out.println(t.getheight() + " feet");
        t.setwheel(4);
        System.out.println(t.getwheel() + " wheel ");

        System.out.println();

        // cretae a object for bus

        bike b = new bike();
        b.setwheel(2);
        System.out.println(b.getwheel() + " wheel");
        b.setheight(5);
        System.out.println(b.getheight() + " feet");
        b.setcapacity(3);
        System.out.println(3+ " person");

    }
}
