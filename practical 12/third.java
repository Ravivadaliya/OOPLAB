import java.util.ArrayList;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {

        // declaretion
        String name;

        // create arraylist
        ArrayList<String> s = new ArrayList<>();

        // create sublist
        ArrayList<String> sublist = new ArrayList<>();

        // scanner
        Scanner in = new Scanner(System.in);

        // enter a name in list
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a " + (i + 1) + " name : ");
            s.add(in.nextLine());
        }
        System.out.println();
        System.out.println("Main list : "+s);

        // enter a name into sublist which name start with charecter "A"
        for (int i = 0; i < 5; i++) {
            if (s.get(i).charAt(0) == 'A') {
                sublist.add(s.get(i));
            }
        }

        // print sublist
        System.out.println("sublist : " + sublist);

    }
}
