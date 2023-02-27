public class Marks {
    public static void main(String[] args) {
        int science = 80;
        int maths = 70;
        int ss = 65;
        int english = 70;
        int total = science + maths + ss + english;
        int a = total*100/400;
        System.out.println(a);

        if(a > 90){
            System.out.println("Grade A \n");
        }
        else if(a > 80){
            System.out.println("Grade B \n");
        }
        else if(a > 70){
            System.out.println("Grade C \n");
        }
        else if(a > 60){
            System.out.println("Grade D \n");
        }
        else{
            System.out.println("Fail");
        }

    }
}
