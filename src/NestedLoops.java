public class NestedLoops {
    public static void main(String args[]){
        /*int n = 4;
        int m = 5;
        //outer loop
        for(int i=1; i<=n; i++){
        //inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //Print Hollow Rectangle
        /*int a = 4;
        int b = 5;
        //outer loop
        for(int i=1; i<=a; i++){
            //inner loop
            for(int j=1; j<=b; ++j){
                //cell -> (i,j)
                if(i == 1 || j == 1 || i == a || j == b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }*/

        //Half Pyramid
        /*int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Inverted Pyramid:
        /*int n = 4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Inverted half pyramid:
        /*int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Print pattern in number form:
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        }
    }

