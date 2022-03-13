import java.util.*;

public class primebetween {

    public static void main(String[] args) {

        //declaration
        int x, y;

        //declar scanner class  
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a lower number : ");
        x = s.nextInt();

        System.out.print("Enter a Higer number : ");
        y = s.nextInt();


        while (x < y) {
            boolean flag = false;

            for(int i = 2; i <= x/2; ++i) {
                // condition for nonprime number
                if(x % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && x != 0 && x != 1)
                System.out.print(x+ " ");

            x++;
        }
    }
}