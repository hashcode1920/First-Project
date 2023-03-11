abstract class Parent1{
    public Parent1(){
        System.out.println("I am an Abstract class of Parent class");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child1 extends Parent1{
    @Override
    public void greet(){
        System.out.println("How Are You...");
    }
    public Child1(){
        System.out.println("I am an Child1 class of Parent class.");
    }
}
abstract class Child2 extends Parent1{
    public void two(){
        System.out.println("I am Fine.");
    }
}

public class abstractMethodAndClass {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.sayHello();
    }
}