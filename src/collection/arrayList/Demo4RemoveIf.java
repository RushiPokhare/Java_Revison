package collection.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// RetainAll method keep the specified list element and removes the rest of the element.
public class Demo4RemoveIf {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Sunil");
        list.add("Anil");
        list.add("Sushil");
        list.add("Rushi");
        list.add("Kartik");
        list.add("Suhas");
        list.add("Suman");

        System.out.println("Before Removal"+"\n"+list);

//        Retain keep This element and Remove all the element 
        System.out.println("After Remove");
        Predicate<String> predicate=x->x.startsWith("S");
        list.removeIf(predicate);
        System.out.println(list);
    }
}
