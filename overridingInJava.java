class X{
    public int a;
    public int math1(){
        return 5;
    }
    public void math2(){
        System.out.println("I am method 2 of class X");
    }
}
class Y extends X{
    @Override
    public void math2(){
        System.out.println("I am method 2 of class Y");
    }
    public void math3(){
        System.out.println("I am method 3 of class Y");
    }

}

public class overridingInJava {
    public static void main(String[] args) {
         X a = new X();
         a.math2();

         Y y = new Y();
         y.math2();

    }
}
