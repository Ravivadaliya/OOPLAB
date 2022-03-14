import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import javax.security.auth.AuthPermission;
import javax.xml.transform.Source;

public class Second {
    public static void main(String[] args) {

        ArrayList<String> s1 = new ArrayList<>();

        // enter name in arraylist
        s1.add("Delhi");
        s1.add("Mumbai");
        s1.add("Banglore");
        s1.add("Hydrabad");
        s1.add("Ahmedabad");

        //before change
        System.out.println("Before change array list :");
        for (String i : s1)
            System.out.print(i + ",");

        // change
        s1.set(4, "surat");
        System.out.println();
        System.out.println();
        
        //after change
        System.out.println("After change array list :");
        for (String i : s1)
            System.out.print(i + ",");
    }
}
