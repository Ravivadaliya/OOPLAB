import java.util.*;

public class areacircle {
   public static void main(String[] args) {

      // declaretion
      int r;
      double pi = 3.14, area;
      
      // declar a scanner for scanning value
      Scanner s = new Scanner(System.in);
      System.err.print("Enter a radias of circle : ");
      r = s.nextInt();

      // formula
      area = pi * (r * r);

      System.out.println("are of ciecle is : " + area);

   }
}
