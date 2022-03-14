import java.util.ArrayList;
import java.util.*;

public class First{
    public static void main(String[] args) {

        int n ;

        //create array list
        ArrayList<Integer> l1 = new ArrayList<>();

        //scanner declare 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a size of array : ");
        n = s.nextInt();

        //print element in list l1
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a "+i+" element : ");
            l1.add(s.nextInt());
        }
        //before sorted
        System.out.println("before sorted : "+l1);

        //this statement is sorted aaray list in increasing order
        Collections.sort(l1);

        System.out.println("After sorted increasing order : "+l1);

        //this statement is sorted aaray list in reverse order
        Collections.reverse(l1);

        //after sorted
        System.out.println("After sorted reverse order "+l1);

        
    
         
    }
}
