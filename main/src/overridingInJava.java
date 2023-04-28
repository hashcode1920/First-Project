class Parent
{
    public void show()
    {
        System.out.println("I am Method A");
    }
}
class Child extends Parent {
    @Override
    public void show()
    {
        super.show();
        System.out.println("I am Method of Class A in Class B");
    }
    public void newMethodOfChild()
    {
        System.out.println("I am New Method of Child class");
    }
}
public class overridingInJava {
        public static void main(String[] args) {
            Child obj = new Child();
            obj.show();

        }
    }

