import java.util.*;

public class meterintofeet {
    public static void main(String[] args) {
        //declaration
        double meter,feet;

        // create a scanner for scanning value 
        Scanner s = new Scanner(System.in);
        System.err.print("enter a meter value : ");

        //scan meter
        meter = s.nextFloat();

        //formula
        feet = meter*3.28084;
        
        System.out.println("value of feet is : "+feet);
        
    }
}
