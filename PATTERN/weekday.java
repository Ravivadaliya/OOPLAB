
import java.util.*;

public class weekday {
    public static void main(String[] args) {

        int n;
        while (1 < 2) {
            //create a scanner for scan value 
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a any number :  ");
            
            //scan n 
            n = s.nextInt();
            
            
            switch (n) {
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("\nSarkhu type kar ne dofa/dofi\n");
            }
        }
    }
}
