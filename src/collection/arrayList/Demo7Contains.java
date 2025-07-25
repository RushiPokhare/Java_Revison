package collection.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Contains method Checked the specified element are in the List.
public class Demo7Contains {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sunil");
        list.add("Anil");
        list.add("Sushil");
        list.add("Rushi");
        list.add("Kartik");
        list.add("Suhas");
        list.add("Suman");
        System.out.println("Tushar is in List-->"+list.contains("Tushar"));
    }
}
