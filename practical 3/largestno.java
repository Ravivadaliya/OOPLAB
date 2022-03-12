import java.util.Scanner;

public class largestno {
    public static void main(String[] args) {
        
        int n1,n2,n3;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a three number to find largest no : ");
        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();

        if(n1>n2){
            if(n1>n3){
                System.err.println("n1 is largest ");
            }
            else{
                System.err.println("n3 is largest");
            }
        }
        else{
            if(n2>n3){
                System.out.println("n2 is largest ");
            }
            else{
                System.out.println("n3 is  largest");
            }
        }
    }
}
