package collection.set.linkedHash.hashSet;

import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("Rushi");
        hashSet.add("Vishal");
        hashSet.add(null);  //Allow only once Because of Duplicate
        hashSet.add(null);
        hashSet.add(20);
        hashSet.add(20);
        System.out.println(hashSet);
    }
}
