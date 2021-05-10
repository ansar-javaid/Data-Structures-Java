package com.Ansar;

import com.Ansar.Queue.Queue;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Queue<String> queue = new Queue<>();
        queue.enqueue("Ansar-0");
        queue.enqueue("Ansar-1");
        queue.enqueue("Ansar-2");
        queue.enqueue("Ansar-3");
        System.out.println(queue.Size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.Size());


    }
}
