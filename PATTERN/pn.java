// check number positive or nagative
import java.util.*;

public class pn {
    public static void main(String[] args) {
        
        int n;

        //create a scanner for scaning value 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number check are positive or nagative:  ");

        // scan n 
        n = s.nextInt();
        
        // logic
        if(n<0)
             System.out.println("enter number are nagative");
             else{
                 System.out.println("enter number are positive");
             }
    }
}
