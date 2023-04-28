class Name
{
    public void show()
    {
        System.out.println("My mane is parent class");
    }
}
class MyName extends Name
{
    @Override
    public void show() {
        System.out.println("I am child class");
    }
}
class YourName extends Name
{
    @Override
    public void show() {
        System.out.println("My Name is second child class");
    }
}
public class dynamicMethodDispatch
{
    //Compile time and Run time
    public static void main(String[] args) {
        Name obj = new MyName();  //Run time Polymorphism
        obj.show();

        obj = new YourName(); //DMD (Dynamic Method Dispatch)
        obj.show();
    }
}
