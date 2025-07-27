//package collection.vector.stack;
//
//import java.util.Stack;
//
//public class VaildParentheses {
//    public static boolean isBalance(String str) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch : str.toCharArray()) {
//            if (ch=='('|| ch=='{'|| ch=='['){
//                stack.push(ch);
//            } else if (ch==')'|| ch=='}'||ch==']') {
//                if(stack.isEmpty()) return false;
//                char top= stack.pop();
//            }
//        }
//    }
//}
