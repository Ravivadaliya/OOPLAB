public class pattern5 {
    public static void main(String[] args) {

        int i, j;

        for (i = 0; i < 5; i++) {
            for (j = 5 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}