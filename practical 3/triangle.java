import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

public class triangle {
    public static void main(String[] args) {
         
        // declaretion
        int x,y,z;

        //declar scanner
        Scanner s = new Scanner(System.in);
        System.out.print("enter a value of sides of triangle : ");
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();


        if(x==y && y==z && z==x){
            System.out.println("Isosceles triangel");
        }
        else if(x==y && y==z){
            System.out.println("equilateral triangle");
        }
        else if(x*x+y*y==z*z && x*x+z*z==y*y&& z*z+y*y==x*x){
            System.out.print("right angle triangle");
        }
        else{
            System.out.println("not any tringle given 3 triangle"); 
        }
    }
}
