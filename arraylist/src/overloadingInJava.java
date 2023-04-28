import java.util.Scanner;
class Calculator
{
    public int add(int a, int b)
    {
        int result = a + b;
        return a + b;
    }
    public double add(double a, int b, int c)
    {
        double result = a + b + c;
        return a + b + c;
    }
}

public class overloadingInJava
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        int result = obj.add(5,6);
        System.out.println(result);
        Calculator obj1 = new Calculator();
        double result1 = obj1.add(34,5,6);
        System.out.println(result1);
    }
}
