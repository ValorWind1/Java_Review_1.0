package intermidiate_Java.Intermidiate;
import java.util.*;
public class Queue01_PriorityQueue {
    public static void main(String[] args) {

        // QUEUE  = FIFO (first in first out)

        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        // populate queue
        queue1.offer("first"); // this will have the highest priority because it was past first
        queue1.offer("second");
        queue1.offer("third");

        System.out.printf("%s",queue1);
        System.out.println();

        //peek elements , method ( will look at the highest priority element )
        System.out.printf("%s",queue1.peek());
        System.out.println();

        // remove elements method , (will remove highest priority)
        queue1.poll();
        System.out.printf("%s",queue1);

    }
}
