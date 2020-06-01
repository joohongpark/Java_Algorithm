package test;

import module.QueueByArray;

public class _QueueUseExample {
    public static void execArray() {
        QueueByArray q = new QueueByArray(10);
        for (int i = 0; i < 15; i++) {
            System.out.println(q.enqueue(i));
        }
        q._print();

    }
}
