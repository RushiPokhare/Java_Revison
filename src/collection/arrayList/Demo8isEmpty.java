package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

// Contains method Checked the specified element are in the List.
public class Demo8isEmpty {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sunil");
        list.add("Anil");
        list.add("Sushil");
        list.add("Rushi");
        list.add("Kartik");
        list.add("Suhas");
        list.add("Suman");
        System.out.println("Given Collection is Empty-->"+list.isEmpty());
    }
}
