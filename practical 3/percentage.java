import java.util.*;

public class percentage {
    public static void main(String[] args) {

        int etc,maths,ds,dbms,df;
        double total,percentage;

        //create a scanner for scanning value 
        Scanner s = new Scanner(System.in);
 
        //enter a subject marks
        System.out.print("Enter etc mark : ");
        etc = s.nextInt();
        System.out.print("Enter maths mark : ");
        maths = s.nextInt();
        System.out.print("Enter ds mark : ");
        ds = s.nextInt();
        System.out.print("Enter dbms mark : ");
        dbms = s.nextInt();
        System.out.print("Enter df mark : ");
        df = s.nextInt();
    
        total = etc+maths+ds+dbms+df;
        System.out.println("total are : "+total);
        percentage = total*100/500;
        System.out.println("percentage are : "+percentage);

            if (percentage >= 60)
                System.out.println("first divition");
                 
            else if (percentage >= 50 && percentage <= 59) {
                System.out.println("Second divition");

            } else if (percentage >= 40 && percentage <= 49) {
                System.out.println("Third divition");

            } else {
                System.out.println("Fail");
            }
        }
    }

