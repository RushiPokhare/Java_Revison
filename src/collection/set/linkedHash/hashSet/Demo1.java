package collection.set.linkedHash.hashSet;

import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("sai");
        hashSet.add("Sakshi");
//        hashSet.add("Sakshi");  <-- it not return this value beacuse of hashcode and equals methods
        hashSet.add("Rushi");
        hashSet.add("Pravin");
        hashSet.add("Aniket");

        System.out.println(hashSet);
    }
}
