package com.StacktoQueue;

public class Main {

    public static void main(String[] args) {
        var queue = new Stack();
        queue.EnQueue(10);
        queue.EnQueue(20);
        queue.EnQueue(30);
        var first = queue.DeQueue();
        System.out.println(first);
        System.out.println(queue.peek());
    }
}
