package intermidiate_Java.Intermidiate;
import java.util.*;
import java.util.Collections;

public class addAll_frequency_disjoint {
    public static void main(String[] args) {

        //Convert stuff array to alist
        String [] stuff = {"apples","beef","corn","ham"};
        List <String> l1 = Arrays.asList(stuff);

        ArrayList <String> l2 = new ArrayList<String>();
        l2.add("youtube");
        l2.add("google");
        l2.add("facebook");

        for( String x : l2){
            System.out.printf("%s ",x);
        }

        //add all method
        Collections.addAll(l2,stuff);
        System.out.println();
        for( String x : l2){
            System.out.printf("%s ",x);

        }
        System.out.println();
        //frequency
        System.out.println(Collections.frequency(l2,"google")); // checks if the item in in the list/collection

        //disjoint will return/check if there are elements in the 2 collections/lists.
        boolean tof = Collections.disjoint(l1,l2);
        System.out.println(tof); // if items exist in both collections it will return false

        if (tof){
            System.out.println("These lsit do not have anything in common");
        }else{
            System.out.println("these list must have something in common!");


        }

    }
}
