package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo3Remove {
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

//        How to Remove Specific Element
        System.out.println("After Removal 100");
        Integer integer=new Integer(100); //<-- After Java 8+ used AutoBoxing and UnBosing
        list.remove(integer);
        System.out.println(list);

    }
}
