class EkClass{
    int a;

    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c) {
        super(c);
        System.out.println("I am a Constructor.");
    }
}
public class this_Super {
    public static void main(String[] args) {
        EkClass a = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(a.getA());

    }
}
