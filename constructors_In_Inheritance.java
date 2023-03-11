class Base{
    int x;
    Base(){
        System.out.println("I am in Base class Constructor");
    }
    Base(int a){
        System.out.println("I am a Overloaded Base class Constructor with value of a as: "+ a);
    }
}
class Derived extends Base{
    Derived(){
        // super(0);
        System.out.println("I am a Derived class Constructor");
    }
    Derived(int a, int b){
        super(a);
        System.out.println("I am a Overloaded Derived class Constructor with value of b as: "+ b);
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am a ChildOfDerived class Constructor");
    }
    ChildOfDerived(int a, int b, int c){
        super(a,b);
        System.out.println("I am a Overloaded ChildOfDerived class Constructor with value of c as: " + c);
    }
}
public class constructors_In_Inheritance {
    public static void main(String[] args) {
        // Derived d = new Derived();
        // Derived b = new Derived(14,9);
        ChildOfDerived cd = new ChildOfDerived(10,11,12);




    }
}
