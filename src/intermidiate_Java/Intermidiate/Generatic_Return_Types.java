package intermidiate_Java.Intermidiate;

import java.util.*;

public class Generatic_Return_Types {
    public static void main(String[] args) {

        System.out.println(max(23,42,1));
        System.out.println(max("apples","chicken","pizza")); // ASCII code , p comes last in dictionary so = greatest

    }

    public static <T extends Comparable<T>> T max(T a , T b , T c){

        T genericvariable = a;   // we start by assuming that genericvariale its the max value

        if(b.compareTo(a) > 0 ){
            genericvariable = b;
        }
        if(c.compareTo(genericvariable) > 0 ){ // we only need to comapre c , now because we already tested a ,and b (above if statement)
            genericvariable= c;
        }
        return  genericvariable;
    }
}
