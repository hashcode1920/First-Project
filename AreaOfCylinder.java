import java.awt.*;
import java.util.Scanner;

class Cylinder{

    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class AreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Cylinder myCylinder = new Cylinder(9,12);
//        System.out.print("Enter the values of Height: ");
//        myCylinder.setHeight(sc.nextInt());
//        System.out.println(myCylinder.getHeight());
//        System.out.print("Enter the Value of Radius: ");
//        myCylinder.setRadius(sc.nextInt());
//        System.out.println(myCylinder.getRadius());
//        System.out.println("The Surface area of Cylinder is: " + myCylinder.surfaceArea());
//        System.out.println("The Volume of Cylinder is: " + myCylinder.volume());

        Rectangle rec = new Rectangle(12,9);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
    }
}
