import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("<---------------First list starts from here--------------->");
        ArrayList<String> list=new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        for(int i=0; i<list.size(); i++) {
            System.out.println("The First List is  :  " + list.get(i));
        }

        System.out.println("<---------------Second list starts from here--------------->");
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("First");
        list2.add("Second");
        list2.add("Third");
        list2.add("Fourth");
        list2.add("Fifth");
        list2.add("Sixth");
        for(int j=0; j<list2.size(); j++) {
            System.out.println("The Second List is  :  " + list2.get(j));
        }

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
        System.out.println("First list     :  " + list);
        System.out.println("Second list    :  " + list2);
        System.out.println("Third list is  :  " + list3);
        System.out.println("First list     :  " + list.size());
        System.out.println("Second list    :  " + list2.size());
        System.out.println("Third list is  :  " + list3.size());

        if(list.equals(list3)) {
            System.out.println("Matched");
        }
        else {
            System.out.println("Not Matched");
        }
    }
}