class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non Parameterized Constructor.");
    }
    Circle(int r){
        System.out.println("I am Circle Parameterized Constructor.");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am Cylinder1 Parameterized Constructor.");
        this.height = h;
    }
    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class circleToCylinder {
    public static void main(String[] args) {
        //Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12,5);

    }
}
