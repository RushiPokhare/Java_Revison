package collection.set.linkedHash;

import java.util.LinkedHashSet;

public class Demo2 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("Rushi");
        linkedHashSet.add("Aniket");
        linkedHashSet.add("Pravin");
        linkedHashSet.add("Sakshi");
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
    }
}
