class A{
    A(){
      System.out.println("here a constracter are A");
    }
}
class B extends A{
    B(){
      System.out.println("here a constracter are B");
    }
}
class C extends B{
    C(){
      System.out.println("here a constracter are C");
    }
}

public class constractinheritan {
    public static void main(String[] args) {
        C c1 = new C();
    }
}
