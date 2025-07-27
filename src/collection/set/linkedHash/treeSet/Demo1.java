package collection.set.linkedHash.treeSet;

import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add(10);
//        treeSet.add("rushi"); <-- Store same type of the data only
//        treeSet.add("Rudra");
        treeSet.add(76);
        treeSet.add(30);
//        treeSet.add(null);   <-- We Cant store NULL
        System.out.println(treeSet);
    }
}
