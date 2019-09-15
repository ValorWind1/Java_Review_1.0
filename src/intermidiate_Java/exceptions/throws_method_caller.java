package intermidiate_Java.exceptions;

import java.io.*;

public class throws_method_caller {

    public static void main(String args[]) {

        try {

            int array1[] = new int[6];

            System.out.println("Access my lucky number element 7 :" + array1[7]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("We caught an exception :" + e);

        }
        System.out.println(" we've gone too far!!! , turn to go back ! ");
    }
}