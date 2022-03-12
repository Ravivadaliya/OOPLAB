import java.util.*;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class calculateswitch {
    public static int main(String[] args) {
        double num1, num2, result;
        int op;

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two number : ");
            num1 = s.nextInt();
            num2 = s.nextInt();

            System.out.println("Enter a operater +,-,*,/ : ");
            op = s.next().charAt(0);

            switch (op) {

                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;

                case '/':
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;

                default:
                    System.out.println("charecter is not coreect");
                    break;
            }
        }

    }
}