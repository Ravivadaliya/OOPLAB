import java.util.Scanner;

public class devidedby2not3 {
    public static void main(String[] args) {

        int num1, num2;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter two number : ");
        num1 = s.nextInt();
        num2 = s.nextInt();

        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0 && i % 3 != 0)
                System.out.print(i + " ");
        }

    }
}