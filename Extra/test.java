import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String s1="";
        int x=0, i;
        for (i = 0; i < 3; i++) {
            s1 = sc.next();
            x = sc.nextInt();
        }

        System.out.println(s1 + "           " + x);
        System.out.println(s1 + "           " + "0" + x);
        System.out.println(s1 + "           " + "0" + x);
        System.out.println("================================");

    }
}
