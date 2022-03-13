import java.util.*;

public class nnoarray {
    public static void main(String[] args) {

        //declaration 
        int n;

        //declar scanner 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        n = s.nextInt();

        //initialisation array
        int a[] = new int[n];

        //Enter element
        for (int i = 0; i < n; i++) {
            System.out.print("Element " +i+ " : ");
            a[i] = s.nextInt();
        }

         //declaration 
        int choise, sum = 0, temp, total = 0;
        int max = a[0];
        double average;

        while (1 < 2) {
            System.out.print("\n\nEnter your choise : \n");
            System.out.print("\n1.addition of all number\n2.find maximum number\n3.find a average\n");
            choise = s.nextInt();

            switch (choise) {

                case 1:
                    for (int i = 0; i < n; i++) {
                        sum = sum + a[i];
                    }
                    System.out.print("Addition of all number is : "+sum);
                    break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        if (a[i] > max) {
                            max = a[i];
                        }
                    }
                    System.out.print("maximum number is : "+max);
                    break;

                case 3:
                    for (int i = 0; i < n; i++) {
                        total = total + a[i];
                    }
                    System.out.println("total is : " + total);
                    average = total / n;

                    System.out.println("Average is : " + average);
                    break;

                default:
                    System.out.println("Enter a valid choise");
                    break;
            }
        }
    }
}
