interface Camera{
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
interface Wifi{
    String[] getConnect();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Dilling" + phoneNumber);
    }
    void takeCall(){
        System.out.println("Picking Up...");
    }
}
class MySmartPhone extends CellPhone implements Wifi, Camera{
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
public class defaultMethods {
    public static void main(String[] args) {
        MySmartPhone mp = new MySmartPhone();
        mp.record4kVideos();
        String[] a = mp.getConnect();
        for (String item : a) {
            System.out.println(item);
        }
    }
}
