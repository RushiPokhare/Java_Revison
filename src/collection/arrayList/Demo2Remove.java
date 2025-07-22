package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo2Remove {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(100);
        list.add(84);
        list.add(null);
        list.add(null);
        list.add(10.2f);
        list.add(90);
        list.add(11);
        System.out.println("Before Removal");
        System.out.println(list);


        System.out.println("After Removal");
        list.remove(0);
        System.out.println("After Removal Element From 0 Index-->"+list);

    }
}
