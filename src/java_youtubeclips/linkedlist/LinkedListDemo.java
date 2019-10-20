package java_youtubeclips.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList <String> link1 = new LinkedList<String>();

        link1.add("a");
        link1.add("b");
        link1.add("c");
        link1.add("d");
        link1.addFirst("e");
        link1.addLast("f");

        System.out.println(link1.size());

    }
}
