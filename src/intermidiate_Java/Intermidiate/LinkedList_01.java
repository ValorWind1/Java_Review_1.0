package intermidiate_Java.Intermidiate;

import java.util.*;

public class LinkedList_01 {
    //
    public static void main(String[] args) {

        String [] things = {"apples", "noobs","pwnage","bacon","goat"};

        List<String> list1 = new LinkedList<String>();

        for(String x : things ){
            list1.add(x);

        }
        String [] things2 = { "sausage","cows","sheeps","harrypotter"};
        List<String> list2 = new LinkedList<String>();
        for(String y : things2){
            list2.add(y);
        }
        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1,2,5);
        printMe(list1);
        reverseMe(list1);
    }

    // print me method
    public static void printMe(List<String> l1){

        for(String i : l1){
            System.out.printf("%s",l1);
            System.out.println();
        }
    }
    public static void removeStuff(List<String> l1 , int from , int to){

        l1.subList(from,to).clear();
    }
    public static void reverseMe (List<String> l1){

        ListIterator<String> ite = l1.listIterator(l1.size());
        while (ite.hasPrevious()){
            System.out.printf("%s",ite.previous());
        }
    }
}
