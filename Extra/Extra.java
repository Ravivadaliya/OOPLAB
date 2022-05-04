import java.util.*;

import javax.xml.validation.Validator;

public class Extra {
    public static void main(String[] args) {
        String firstName = "ravi vadaliya";
        String lastName = "vadaliya";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(0));
        System.out.println(lastName.substring(1, 5));
        System.out.println(lastName.codePointAt(3));
        System.out.println(lastName.toLowerCase());
        System.out.println(lastName.toUpperCase());
        System.out.println(firstName.indexOf("a"));

        int x = 10;
        int y = 9;
        System.out.println(x > y);

    }

}
