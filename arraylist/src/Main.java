import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("First");
        list.add("name");
        list.add("is");
        list.add("Jay");

        ArrayList<String> list2=new ArrayList<String>();
        list2.add("First");
        list2.add("name");
        list2.add("is");
        list2.add("Jay");

        ArrayList<String> list3=new ArrayList<String>();
        for(int i=0;i<list2.size();i++) {
            for(int j=0;j<list.size();j++) {
                if(list2.contains(list.get(j))==true) {
                    if(list2.get(i)==list.get(j)) {
                        list3.add(list2.get(i));
                    }
                }
                else {
                    break;
                }
            }
        }

        if(list.equals(list3)) {
            System.out.println("Matched");
        }
        else {
            System.out.println("Not Matched");
        }
    }

}