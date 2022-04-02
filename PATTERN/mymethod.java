import java.util.*;

public class mymethod{ 
        public static void Mymethod(int a ,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("after a value swapping x and y :"+a+" "+b);
        }

    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a vlue of x and y : ");
        x = s.nextInt();
        y = s.nextInt();

        Mymethod(x,y);
    
    }
}
