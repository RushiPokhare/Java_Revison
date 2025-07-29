package collection.set.linkedHash.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

// Bounded Queue
public class Demo5_Bounded {
    public static void main(String[] args) {
        Queue<String> queue=new ArrayBlockingQueue(4);
        queue.add("Rushi");
        queue.add("Sarthak");
        queue.add("Anil");
        queue.add("Sunil");

//        queue.offer("Sachinn"); <-- this is not added for se the result we write the following line

        boolean result=queue.offer("Sachinn");

        System.out.println("Sachinn Added into queue -->"+result); // false <- because of queue is full

        System.out.println(queue);
    }
}
