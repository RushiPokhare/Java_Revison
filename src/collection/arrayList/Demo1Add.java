package collection.arrayList;

import java.util.ArrayList;
import java.util.List;
// All array list Features are implemented here
public class Demo1Add {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(null);
        list.add(null);
        list.add(10.2f);
        list.add("Rushi");
        list.add(56);
        list.add(33);
        list.add(89);
        System.out.println("Collection Data"+list);
    }
}
