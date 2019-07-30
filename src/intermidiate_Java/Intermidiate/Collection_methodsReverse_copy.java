package intermidiate_Java.Intermidiate;
import java.util.*;
import java.util.Collections;

public class Collection_methodsReverse_copy {
    public static void main(String[] args) {

        // create an array and convert to list
        Character [] ray = {'p','w','n'};
        List<Character> l1 = Arrays.asList(ray);

        System.out.println("List is : ");
        output(l1);

        // Reverse and print out the list
        Collections.reverse(l1);
        System.out.println("After reverse : ");
        output(l1);

        // Create new array and new list , Copy list method
        Character[] newray = new Character[3];
        List<Character> listcopilin = Arrays.asList(newray);
        //copy contents
        Collections.copy(listcopilin,l1);
        System.out.println("Copy of list : ");
        output(listcopilin);

        // take collection/list and fill it with new data
        Collections.fill(l1,'X');
        System.out.println("After filling the list with Xs: ");
        output(l1);


    }
    private static void output(List<Character> thelist){

        for(Character x : thelist){
            System.out.printf("%s",x);

        }
        System.out.println();

    }
}
