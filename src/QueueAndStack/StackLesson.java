package QueueAndStack;

import java.util.Stack;

public class StackLesson {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.empty());

        while(!stack.empty()){
            System.out.println(stack.pop());
        }

        }
    }
