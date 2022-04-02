import java.util.Scanner;

public class continu {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter n  : ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
             if(i==5){
               continue;
             }
            System.out.println(i);
        }
        

    }
}
