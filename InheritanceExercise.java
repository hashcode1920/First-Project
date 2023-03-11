class Parent{
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        System.out.println("I am now in Parent Class and setting A");
        this.a = a;
    }
}
class Child extends Parent{
    public int  b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        System.out.println("I am now in Child Class and setting B");
        this.b = b;
    }
}


public class InheritanceExercise {
    public static void main(String[] args) {
        // Creating an Object of Base Class
        Parent p = new Parent();
        p.setA(10);
        System.out.println(p.getA());

        Child c = new Child();
        c.setB(15);
        System.out.println(c.getB());

    }
}
