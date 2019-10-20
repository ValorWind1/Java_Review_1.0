package java_youtubeclips.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> tree1 = new TreeSet<Integer>();

        tree1.add(1);
        tree1.add(5);
        tree1.add(1);
        tree1.add(5);
        tree1.add(10);
        tree1.add(7);

        System.out.println(tree1);

        // other methods

        tree1.first();



        // Iterator
        Iterator<Integer> iter = tree1.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        }

    }

