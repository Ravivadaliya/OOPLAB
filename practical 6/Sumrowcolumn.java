
//sum of each row and column in 4*4 matrix
//ex -8
import java.util.*;

import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner14;

public class Sumrowcolumn {
    public static void main(String[] args) {
        // declaration
        int m, n;
        int sumrow;
        int sumcolumn;

        // create a scanner for scanning value
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value of m and n :  ");

        // enter m*n mattrix
        m = s.nextInt();
        n = s.nextInt();

        // array initialization for value m and n
        int arr[][] = new int[m][n];

        // enter element in matrix
        System.out.println("\nEnter elements of matrix:\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter a value of row " + i + " colomn " + j + ":");
                arr[i][j] = s.nextInt();
            }
        }

        // logic
        for (int i = 0; i < m; i++) {
            // each row and column are execution value of sumrow and sumcolumn is zero
            sumrow = 0;
            sumcolumn = 0;
            for (int j = 0; j < n; j++) {
                sumrow = sumrow + arr[i][j];
                sumcolumn = sumcolumn + arr[j][i];
            }
            System.out.println("sum of row " + i + " : " + sumrow);
            System.out.println("sum of column " + i + " : " + sumcolumn);
        }

    }
}