package com.StacktoQueue;

import java.util.Arrays;

public class Stack {
    private java.util.Stack<Integer> stack =  new java.util.Stack<>();
    private java.util.Stack<Integer> stack1 = new java.util.Stack<Integer>();

    public void EnQueue(int item){
       stack.push(item);
   }
    public int DeQueue(){
        if(stack.isEmpty() && stack1.isEmpty()){
            throw new IllegalStateException();
        }
        moveStackToStack1();
        return stack1.pop();
    }

    private void moveStackToStack1() {
        if(stack1.isEmpty()) {
            while (!stack.isEmpty()) {
                var item = stack.pop();
                stack1.push(item);
            }
        }
    }

    public int peek(){
        if(stack.isEmpty() && stack1.isEmpty()){
            throw new IllegalStateException();
        }
        moveStackToStack1();
        return stack1.peek();
    }

}
