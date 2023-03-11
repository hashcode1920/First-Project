class Phone{
    public void welcome() {
        System.out.println("Welcome to Java...");
    }
    public void on() {
        System.out.println("Turing on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing Music...");
    }
    @Override
    public void on() {
        System.out.println("Turing on Smartphone... ");
    }
}
public class dynamicMethodDispatch {
        public static void main(String[] args) {
         Phone obj = new SmartPhone(); // Allowed -->  Super obj = new SubClass is allowed but, Sub to super is not allowed.

         obj.welcome();
         obj.on();

     }
}

