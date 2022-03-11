import java.util.*;

public class percentage{
    public static void main(String[] args) {
        
        //declaretion
        int sub1,sub2,sub3,sub4,sub5;
        double total,percentage;
         
        //create s scaneer for scanning value 
        Scanner s = new Scanner(System.in);

        //enter marks
        System.out.print("Enter sub1 marks : ");
        sub1= s.nextInt();
        System.out.print("Enter sub2 marks : ");
        sub2= s.nextInt();
        System.out.print("Enter sub3 marks : ");
        sub3= s.nextInt();
        System.out.print("Enter sub4 marks : ");
        sub4= s.nextInt();
        System.out.print("Enter sub5 marks : ");
        sub5= s.nextInt();

        total = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total of 5 subject : "+total);
        percentage = (total*100)/500;
        System.out.print("percentage of 5 subject is : "+percentage);
    }
}