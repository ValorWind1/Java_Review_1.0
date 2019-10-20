package java_youtubeclips.hashtabledemo;

import java.util.Hashtable;

public class htdemo {

    public static void main(String[] args) {


        Hashtable<String, Integer> htable1 = new Hashtable<String, Integer>();

        htable1.put("Link",2);
        htable1.put("Zelda",5);
        htable1.put("Wolf",7);
        htable1.put("Mina",1);

        System.out.println(htable1);

    }
}