interface SampleInt{
    void meth1();
    void meth2();
}
interface ChildSample extends SampleInt{
    void meth3();
    void meth4();
}
class MySampleClass{
    void meth1(){
        System.out.println("meth 1");
    }
    void meth2(){
        System.out.println("meth 2");
    }
    void meth3(){
        System.out.println("meth 3");
    }
    void meth4(){
        System.out.println("meth 4");
    }
}
public class inheritanceInInterface {
    public static void main(String[] args) {
        MySampleClass sc = new MySampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
