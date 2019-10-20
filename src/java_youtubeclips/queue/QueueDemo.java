package java_youtubeclips.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> qu1 = new LinkedList<>();

        // . add ( )

        for (int i =0 ; i < 5 ; i ++){
            qu1.add(i);
        }

        System.out.println(qu1);

        System.out.println(qu1.remove());
        System.out.println(qu1);

        // peek

        System.out.println(qu1.peek());


        System.out.println(qu1.poll());
        System.out.println(qu1);

    }


}
