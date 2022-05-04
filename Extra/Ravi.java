import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Ravi {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("enter a value of n :");
        n = s.nextInt();
        String ar[] = new String[2000];

        for (int i = 0; i < (2 * n); i++) {
                ar[i] = s.next();
        }                                

        for (int i = 0; i < (2 * n); i += 2) {
            for (int j = 0; j < 5; j++) {
                if (ar[i].charAt(j) == ar[i + 1].charAt(j)) {
                    System.out.print("G ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
        
    }

}
