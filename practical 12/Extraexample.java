import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ex1
 */
public class Extraexample {

    public static void main(String[] args) {

        int n;
        //creaate arraylist.
       ArrayList<Integer> l1 = new ArrayList<>();
        // declare scanner
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your choise:\n ");
            System.out.print("1.ADD ElEMENT\n2.REMOVE ELEMENT\n3.DISPLAY ELEMEMT\n4.EXIT\n");
            n = s.nextInt();
            switch(n) {

                case 1:
                    System.out.print("Enter a element : ");
                    l1.add(s.nextInt());
                    break;

                case 2:
                    System.out.print("Enter index for remove element : ");
                    int elementremove = s.nextInt();
                    if (l1.contains(elementremove)) 
                    {
                        l1.remove(elementremove);
                    } else {
                        System.out.println("Element are not found");
                    }
                    break;

                case 3:
                    System.out.print("Your array list : \n" + l1);
                    System.out.println();
                    System.out.println();
                    break;

                default :
                   System.out.println("Enter choise invalid");
            }
        }
    }
}

// this method are return are boolean
// we dont to do anything //because element to raedy to add array list
// so let's add a not operater
// if (!string.contains(temp))
