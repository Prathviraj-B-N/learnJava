package com.prathviraj;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class learnLinkedList {
    public static void LL(){
        //Queue is interface implemented using queue
        Queue<Integer> queue = new LinkedList<>();
        //Enqueue
        queue.offer(24);
        queue.offer(21);
        queue.offer(20);
        queue.offer(54);
        System.out.println("Queue:"+queue);

        //Peek returns null if queue empty
        System.out.println("Peek :"+queue.peek());

        //Dequeue
        System.out.println("Poll :"+queue.poll());
        System.out.println("Queue:"+queue);

        List<Integer> ll = new LinkedList<>();

    }

}
