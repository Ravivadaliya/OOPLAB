// All the operation in matrix
// suppose User entter a m*n matrix 
// calculate the addition,substraction,multiphication,divition
import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        // declaration
        int m, n;

        // create a scanner for scanning value
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value of m and n :  ");

        // enter m*n mattrix
        m = s.nextInt();
        n = s.nextInt();

        // array initialization for value m and n
        int arr[][] = new int[m][n];
        int a[][] = new int[m][n];
        int c[][] = new int[m][n];

        // first matrix
        System.out.println("\nEnter elements of 1st matrix:\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter a value of row " + i + " colomn " + j + ":");
                arr[i][j] = s.nextInt();
            }
        }
        // second matrix
        System.out.println("\n\nEnter elements of 2st matrix:\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter a value of row " + i + " colomn " + j + ":");
                a[i][j] = s.nextInt();
            }
        }

        int total = 0, total2 = 0;

        // addition
        System.out.println("addition of two materix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                total += arr[i][j];
                total2 += a[i][j];
                c[i][j] = arr[i][j] + a[i][j];
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();// new line
        }
        // substraction
        System.out.println("substaction of two materix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = arr[i][j] - a[i][j];
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();// new line
        }
        // multiplication
        System.out.println("multiplication of two materix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = arr[i][j] * a[i][j];
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();// new line
        }

        // divition
        System.out.println("divition of two materix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = arr[i][j] / a[i][j];
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();// new line
        }

        System.out.println("total of 1st mattrix are : " + total);
        System.out.println("total of 2nd mattrix are : " + total2);

    }

}