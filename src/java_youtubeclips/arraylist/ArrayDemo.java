package java_youtubeclips.arraylist;

import java.util.ArrayList;

public class ArrayDemo {

    public static void main(String[] args) {

        ArrayList<String> heroes = new ArrayList<String>();

        heroes.add("Batman");
        heroes.add("SuperMan");
        heroes.add("SpiderMan");

        System.out.println(heroes);

        heroes.remove(2);
        System.out.println(heroes);

        System.out.println(heroes.size());


    }
}
