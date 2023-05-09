public class FloydTriangle {
    public static void main(String[] args) {
        int num = 5;
        int number = 1;
        int num2 = 4;


        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print(number+"   ");
                if(number<10) {
                    System.out.print(" ");
                }
                number++;
            }
            System.out.println();
        }
        for (int i = num2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number+"   ");
                number++;
            }
            System.out.println();
        }
    }
}
