/*class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}*/

class Square{
    int a;
    int perimeter;

    public int area(){
        return a*a;
    }
    public int perimeter(){
        return 4*a;
    }


}

public class OOPsConcepts {
    public static void main(String[] args) {
        /*Employee Dipen = new Employee();
        Dipen.setName("Dipen Parmar KITSOL");
        Dipen.salary = 40000;
        System.out.println("My name is: " + Dipen.getName());
        System.out.println("My Salary is: " + Dipen.getSalary());
*/
        Square sq = new Square();
        sq.a = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
