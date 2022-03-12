
//calculate area using method overloading
import java.util.Scanner;

public class findarea {

    static void calculatearea(double r) {
        double pi = 3.14, area;
        area = pi * r * r;
        System.out.print("area of circle is : " + area);
        System.out.println();
        System.out.println();//for new line
    }

    static void calculatearea(double b, double h) {
        double area;
        area = 0.5 * b * h;
        System.out.print("area of triangale is : " + area);
        System.out.println();
        System.out.println();
    }

    static void calculatearea(Float side) {
        double area;
        area = side * side;
        System.out.print("area of triangale is : " + area);
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {

        int choise;
        Scanner s = new Scanner(System.in);

        while (true) {

            System.out
                    .print("Enter 1 find area of circle\nEnter 2 find area of triangle\nEnter 3 find area of square\n\nEnter -> ");
            choise = s.nextInt();

            switch (choise) {
                case 1:
                    double r;
                    System.out.println("Enter a radias of circle : ");
                    r = s.nextDouble();
                    calculatearea(r);
                    break;

                case 2:
                    double b, h;
                    System.out.println("Enter a base of triangle : ");
                    b = s.nextDouble();
                    System.out.println("Enter a hight of triangle : ");
                    h = s.nextDouble();
                    calculatearea(b, h);
                    break;

                case 3:
                    double side;
                    System.out.println("Enter a size of square : ");
                    side = s.nextDouble();
                    calculatearea(side);
                    break;

                default:
                    System.out.println("Enter a valid choise");
                    break;
            }
        }

    }
}
