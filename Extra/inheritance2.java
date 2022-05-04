class demo1{
    int i;
    private int j;

    void set(int x,int y){
        i = x;
        j = y;
    }
}

class demo2 extends demo1{
   int total;
   void sum(){
       total = i+j;
   }
}

public class inheritance2 {
    public static void main(String[] args) {
        
        demo2 d2 = new demo2();

        d2.set(5, 10);
        d2.sum();

        System.out.println("total is : "+d2.total);
    }
}
