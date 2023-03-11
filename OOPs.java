class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write something.");
    }
    public void print(){
        System.out.println(this.color);
    }
    public void brand(){
        System.out.println(this.type);
    }
}

public class OOPs{
    public static void main(String[] args) {
       Pen pen1 = new Pen();
       pen1.color = "blue";
       pen1.type = "ball";

       Pen pen2 = new Pen();
       pen2.color = "black";
       pen2.type = "Parker";

       Pen pen3 = new Pen();
       pen3.color = "black";
       pen3.type = "Butter flow";

       pen1.write();
       pen2.print();
       pen3.brand();

    }
}


