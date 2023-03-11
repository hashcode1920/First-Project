abstract class Pen1{
    abstract void write();
    abstract void refill();

}
class FountainPen extends Pen1{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNip(){
        System.out.println("Changing the Nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void eat(){
        System.out.println("Eating...");
    }
}
interface BasicAnimal{
    void bite();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello how are you...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }

}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
interface TvRemote{
    void pressBtn();
    void changeVolume();
}
class SmartTelphone extends Telephone implements TvRemote{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Picking Up...");
    }
    public void disconnect(){
        System.out.println("Disconnecting the phone....");
    }
    public void pressBtn(){
        System.out.println("Button Pressed.");
    }
    public void changeVolume(){
        System.out.println("Volume Raised");
    }
}
public class practiceSetOfAbstractClassesAndInterfaces {
    public static void main(String[] args) {
//        FountainPen fp = new FountainPen();
//        fp.changeNip();

//        Human m = new Human();
//        m.speak();
//        m.sleep();
//        m.eat();
//        m.bite();
//        m.jump();
        Telephone sp = new SmartTelphone();
//        sp.disconnect();

        TvRemote p1 = new SmartTelphone();
        p1.changeVolume();
    }
}
