package blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Demo1 {
    /**
     * The queued items
     * 队列元素
     */
    final Object[] items;
//    LinkedBlockingQueue
//    PriorityBlockingQueue
        public Demo1(Object[] items) {
        this.items = items;
    }
}
