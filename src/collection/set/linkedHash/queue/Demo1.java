package collection.set.linkedHash.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("A");
        q.add("B");

        System.out.println(q.isEmpty());     // false
        System.out.println(!q.isEmpty());    // true

    }
}
