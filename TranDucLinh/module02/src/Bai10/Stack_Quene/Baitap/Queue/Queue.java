package Bai10.Stack_Quene.Baitap.Queue;

import static Bai10.Stack_Quene.Baitap.Queue.Solution.displayQueue;
import static Bai10.Stack_Quene.Baitap.Queue.Solution.enQueue;

public class Queue {
    public static void main(String args[])
    {
        // Create a queue and initialize front and rear
        Solution.Queue q = new Solution.Queue();
        q .front = q .rear =  null;

        // Inserting elements in Circular Queue
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // Display elements present in Circular Queue
        displayQueue(q);

        // Deleting elements from Circular Queue
       /* System.out.printf("
                Deleted value = %d", deQueue(q));
        System.out.printf("
                Deleted value = %d", deQueue(q));*/

        // Remaining elements in Circular Queue
        displayQueue(q);

        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);

    }
}
