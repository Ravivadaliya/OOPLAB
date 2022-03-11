import java.util.Scanner;

public class bmi{
   public static void main(String[] args) {

      double weight,hight,weightkg,hightmeter,bmi;
      Scanner s = new Scanner(System.in);

     System.out.print("Enter a weight in pounds : ");  
     weight = s.nextDouble();

     System.out.print("Enter a hight in inches : "); 
     hight = s.nextDouble();

      weightkg = weight * 0.45359237;
      hightmeter = hight * 0.0254;

     bmi = weightkg / (hightmeter*hightmeter);
     System.out.println(bmi);

   }
}
