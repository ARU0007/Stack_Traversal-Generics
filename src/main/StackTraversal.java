package main;

import java.util.Stack;

public class StackTraversal {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        //inserting elements in Stack
        stack.push(70);
        stack.push(71);
        stack.push(72);
        stack.push(73);
        System.out.println("Traversed Stack");
        traverseStack(stack);

    }
    //creating method for Traversal
    public static void traverseStack(Stack<Integer> stack){
        for(int i =stack.size()-1 ;i>=0; i--){
            System.out.print(stack.get(i) + " ");

        }

    }
}
