interface Camera2{
    void takePicture();
    void recordVideos();
    private void sayHello(){
        System.out.println("Hello");
    }
    default void record4kVideos(){
        sayHello();
        System.out.println("Recording in 4k...");
    }
}
interface Wifi2{
    String[] getConnect();
    void connectToNetwork(String network);
}
class CellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Dilling" + phoneNumber);
    }
    void takeCall(){
        System.out.println("Picking Up...");
    }
}
class MySmartPhone2 extends CellPhone2 implements Wifi2, Camera2{
    public void takePicture(){
        System.out.println("Snap Taken.");
    }
    public void recordVideos(){

        System.out.println("Recording Video.");
    }
    //    public void record4kVideos(){
//        System.out.println("Taking Sanp and Recording in 4k");
//    }
    public String[] getConnect(){
        System.out.println("Lists fo Networks: ");
        String[] networkLists = {"TikonaWifi", "JioFiber", "Purvish"};
        return networkLists;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting" + network);
    }
}
public class javaPolymorphism {
    public static void main(String[] args) {
        // Similar to Dynamic Method Dispatch in Inheritance.
        Camera2 c2 = new MySmartPhone2(); // only can use Camera2 method.
        c2.takePicture();
    }
}
