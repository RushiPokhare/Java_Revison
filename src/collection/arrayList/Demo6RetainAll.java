package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

// RetainAll method keep the specified list element and removes the rest of the element.
public class Demo6RetainAll {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(100);
        list.add(84);
        list.add(34);
        list.add(21);
        list.add(null);
        list.add(null);
        list.add(10.2f);
        list.add(90);
        System.out.println("Before Removal"+"\n"+list);

//        Retain keep This element and Remove all the element
        System.out.println("After Remove");
        List list1=new ArrayList();
        list1.add(34);
        list1.add(10.2f);
        list1.add(null);
        list1.add(90);

        list.retainAll(list1);
        System.out.println(list);
    }
}
