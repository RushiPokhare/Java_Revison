package collection.set.linkedHash.queue;

import java.util.LinkedList;
import java.util.Queue;
// Unbounded Queue
public class Demo4_Unbounded {
    public static void main(String[] args) {
        Queue queue=new LinkedList();
        queue.add("Rushi");
        queue.add("Sarthak");
        queue.add("Anil");
        queue.add("Sunil");
        System.out.println(queue);
    }
}
