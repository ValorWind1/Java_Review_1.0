package intermidiate_Java.Intermidiate;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator1 {

    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(3);
        array1.add(7);
        array1.add(9);

        Iterator<Integer> it = array1.iterator();  // creates the iterator , sets it to the beginning

        //using while loop
        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println();
//        //using for loop
//        System.out.println();
//        for(Iterator<Integer> it1 = array1.iterator();it.hasNext();){
//            System.out.println(it.next());
//        }

        Iterator<Integer> it1 = array1.iterator();
        it1.next();

        System.out.println(array1);


    }

}
