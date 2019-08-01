package intermidiate_Java.Intermidiate;
import java.util.*;
public class HashSet {

    // hashsets = a set is a collection , cannot contain any duplicates

    public static void main(String[] args) {

        String [] array1 = {"apple","bob","ham","bob","bacon"};
        List<String> list1 = Arrays.asList(array1);

        System.out.println(list1);


        Set<String> set1 = new java.util.HashSet<String>(list1);
        System.out.println(set1);


    }


}
