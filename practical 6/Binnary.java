import java.util.*;

public class Binnary {

    public static void main(String[] args) {

        //declaretion
        int i, x, n;
        System.out.println("Enter size of array : ");

        //declare scanner 
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        //initialize array
        int arr[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("enter  " + i + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("Enter a element to search : ");
        x = s.nextInt();

        //binary search logic 
        int minindex;
        int low = 0, high = n - 1;

        while (low <= high) {
            minindex = (high + low) / 2;
            if (arr[minindex] == x) {
                System.out.println("Element are present in index : " + minindex);
                break;
            } else if (arr[minindex] < x) {
                low = minindex + 1;
            } else {
                high = minindex - 1;
            }
        }

    }
}
