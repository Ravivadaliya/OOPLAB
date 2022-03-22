import java.security.DrbgParameters.Capability;
import java.util.ArrayList;

import javax.naming.InitialContext;

import java.util.*;

public class Arraylistinformation {

    // what is array list ??
    // syntex--->"ArrayList<Integer> l1 = new ArrayList<>();"
                //here i m declare integer data type of array list you can choose any peramerer

    // it is a genric syntex
    // genric meaning -> class ko supply any parameter
    // arayy list -> String ,int etc..->paraeter

    // it is modify array , you can any operatioin perform of array list
    // add element,delete,display.
    // ArrayList<Integer> l1 = new ArrayList<>();
    // here l1 is name of array list  you can choose any name of array list by yourself

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(15);
        l1.add(3);
        l1.add(4);
        l1.add(89);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(9);
        l1.add(10);
        
        //l1.remove() // perticular index point and remove element

        // this statement says to element are present or not in arraylist->contains
        //if present that return true either flase
        System.out.println(l1.contains(6));
        System.out.println(l1.contains(27));

        //using for loop
       // for(Integer i : l1){
        //    System.out.println(i);
        //}

        // this method show to particuler index of element are present
        System.out.println(l1.indexOf(89));

        // if same element are present of arraylist and we show to last element
        // using this method
        System.out.println(l1.lastIndexOf(15));
        
        //Assume that arraylist are unsorted
        //we have perform to print increasing order of array list
        Collections.sort(l1); 
        System.out.println(l1); 

        //reverse order 
        Collections.reverse(l1);
        System.out.println(l1);

        //size of arraylist 
        System.out.println(l1.size());

        //To modify an element, use the set() method and refer to the index number:
        //-->"l1.set(index, element) "


    }
}
