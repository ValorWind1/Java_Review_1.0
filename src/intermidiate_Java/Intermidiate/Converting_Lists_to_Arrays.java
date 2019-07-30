package intermidiate_Java.Intermidiate;
import java.util.*;
public class Converting_Lists_to_Arrays {
    public static void main(String[] args) {

        String stuff [] = {"baby","ferrari","mercedes","renault"};
        LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(stuff));

        list1.add("lasagna");
        list1.addFirst("firtthing");

        //convert back to an array
        stuff = list1.toArray(new String[list1.size()]);

        for(String x : stuff){
            System.out.printf("%s ",x);
        }

    }
}
