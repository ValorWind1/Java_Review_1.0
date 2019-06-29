package java_tutorial.Arrays;

import java.util.Random;

public class array_elements_counters {

    public static void main(String[] args) {

        Random rd = new Random();
        int a[] = new int[7];

        for (int roll = 1; roll < 1000; roll++) {
            ++a[1+rd.nextInt(6)];

        }

        System.out.println("Face\tFrequency");

        for(int face=1;face<a.length;face++){
            System.out.println(face+"\t"+a[face]);
        }

    }
}
