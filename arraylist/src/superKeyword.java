class A{
    int a =10;
}
class B extends A{
    int b = 20;
    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
public class superKeyword {
public static void main(String[] args) {
    B obj1 = new B();
    obj1.show(obj1.a);

    }
}
