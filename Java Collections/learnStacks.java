package com.prathviraj;
import java.util.Stack;

public class learnStacks {
    public static void stk(){
        Stack<Integer> stack = new Stack<>();
        stack.push(15);
        stack.push(20);
        stack.push(25);
        System.out.println("Stack:"+stack);
        System.out.println("Peek:"+stack.peek());
        System.out.println("Popped:"+stack.pop());
        System.out.println("Peek:"+stack.peek());
    }

}

/*
Output:
    Stack:[15, 20, 25]
    Peek:25
    Popped:25
    Peek:20
*/