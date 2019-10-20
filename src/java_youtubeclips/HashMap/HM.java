package java_youtubeclips.HashMap;

import java.util.HashMap;

public class HM {

    public static void main(String[] args) {

        HashMap<Integer , String > hmap1 = new HashMap<Integer, String>();

        hmap1.put(1,"Mario");
        hmap1.put(10,"Luigi");
        hmap1.put(5,null);
        hmap1.put(null,"Wario");
        hmap1.put(7,"Peach");
        hmap1.put(3,"Toad");


        System.out.println(hmap1);

    }
}
