package collection.vector.stack;

import java.util.Stack;

public class Demo2 {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(100);
        stack.push(45);
        stack.push(12);
        stack.push(20.4F);

        System.out.println("Stack is Empty ?"+stack.isEmpty());

        System.out.println("Size of stack is -> "+stack.size());

        System.out.println("search 45 in the stack(Checks from bottom to top ->"+stack.search(45));

    }
}
