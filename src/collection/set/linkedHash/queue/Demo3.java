package collection.set.linkedHash.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo3 {
    public static void main(String[] args) {
        Queue queue=new LinkedList();
        queue.add("Rushi");
        queue.add(null);
        queue.add(null);
        queue.add(56);
        System.out.println(queue);
    }
}
