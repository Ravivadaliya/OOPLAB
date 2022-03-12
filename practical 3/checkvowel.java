import java.util.Scanner;

 class checkvowel {
    public static void main(String[] args) {
        
        // declaration 
        char ch;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number to check vowel or consonants : ");
        ch = s.next().charAt(0);
        
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
            System.out.println(" Given charater is vowel");
        }
        else{
            System.out.println(" Given charater is consonants");
        }

    }
}
