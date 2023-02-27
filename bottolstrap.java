//Inheritance:
class bottol{
    int liquidplastic;
    public void bottol(int melt, int heat){
        liquidplastic = heat + melt;
        System.out.println("The mixture of both is" + liquidplastic);
    }
    public void bottolcap(int moldit, int shapit){
        liquidplastic = moldit - shapit;
        System.out.println("The difference of both is" + liquidplastic);
    }
}
public class bottolstrap extends bottol {
    public void strap(int plastic, int hook){
        liquidplastic = plastic * hook;
        System.out.println("The product of both is" + liquidplastic);
    }
    public static void main(String[] args){
        int bottol =1, bottolcap = 2;
        bottolstrap demo = new bottolstrap();
        demo.bottol(1,2);
        demo.bottolcap(1,2);
        demo.strap(1,2);
    }
}