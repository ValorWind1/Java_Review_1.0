package intermidiate_Java.Intermidiate;

import java.util.*;
import java.util.Collections;

public class Collections_MethodSort {
    public static void main(String[] args) {


        String [] crap = {"apples","lemons","baacon","ferrari","burger"};

        List<String> l1 = Arrays.asList(crap);

        // collection methods , it doesnt work on array, but it does on a list

        Collections.sort(l1);
        System.out.printf("%s\n",l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.printf("%s\n",l1);
    }
}
