package collection.vector.stack;

import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Stack stack=new Stack<>();
        stack.push(100);
        stack.push(100);
        stack.push(2.5f);
        stack.push(true);
        stack.push(12);
        stack.push("Sai");

        System.out.println("Before Pop ->"+stack);

        System.out.println("Current element in Stack is -->"+stack.peek());
        stack.pop();
        System.out.println("Current Element is stack After pop -->"+stack.peek());
        System.out.println("After Pop ->"+stack);
    }
}
