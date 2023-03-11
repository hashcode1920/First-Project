interface Bicycle{
    // Any properties you can make in Interface that will be Assign to Final Automatically.
    int a = 10;    // This is Final properties int interface It is Redundant which can not be changed.
    void applyBreak(int decrement); // Interfaces are public by default.
    void applySpeed(int increment);
}
class AoneCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Press Horn");
    }
    public void applyBreak(int decrement){
        System.out.println("Applied Break");
    }
    public void applySpeed(int increment){
        System.out.println("Applied Speed");
    }
}

public class interfacesInJava {
    public static void main(String[] args) {
        AoneCycle cycle =  new AoneCycle();
        cycle.applyBreak(2);
        System.out.println(cycle.a);
    }
}
