package intermidiate_Java.Intermidiate;
import java.util.*;

public class Collections {
    public static void main(String[] args) {

        // unlike an array collections are dynamic . set/lists are dynamic

        //sets no dupliactes

        // lists dupliactes


        // create first array
        String[] stuff = {"eggs","lasers","hats","pie"};
        //create frist list
        List<String> list1 = new ArrayList<String>();
        //  create for advance loop, where we add the stuff inside the array to the list
        for(String i: stuff){
            list1.add(i);
        }

        // second array
        String[] things = {"eggs","hats"};
        // we create a 2nd list
        List<String> list2 = new ArrayList<String>();
        // create for advance loop, where we add the stuff inside the array to the list
        for(String x: things){
            list2.add(x);
        }


        // prints list 1
        for ( int i = 0 ; i<list1.size();i++){
            System.out.printf("%s ",list1.get(i));
        }

        // edits
        editlist(list1,list2);
        System.out.println();


        // prints list 1
        for ( int i = 0 ; i<list1.size();i++){
            System.out.printf("%s ",list1.get(i));
        }

    }

    public static void editlist(Collection<String> l1, Collection<String> l2) {
        Iterator<String> iti = l1.iterator(); // Iterator =  goes through each list item by item
        while (iti.hasNext()) { // goes through the entire list
            if (l2.contains(iti.next())) {   // if list 2 contains items from list 1 , remove them (from list 1)
                iti.remove();
            }

        }
    }

}
