package collection.set.linkedHash.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        {
            String task = queue.poll();
            System.out.println("Processing: " + task);
        }

    }
}
