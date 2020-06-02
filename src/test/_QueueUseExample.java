package test;

import module.QueueByArray;
import module.QueueByLinkedList;

public class _QueueUseExample {
    public static void execArray() {
        //QueueByArray q = new QueueByArray(10);
        QueueByLinkedList q = new QueueByLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Used Size : " + q.usedSize());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("Used Size : " + q.usedSize());

    }
}
