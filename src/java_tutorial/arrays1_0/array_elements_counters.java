package java_tutorial.arrays1_0;

import java.util.Random;

public class array_elements_counters {
    public static void main(String[] args) {


        Random rd = new Random();

        int frequency[] = new int[7];

        for (int i = 1; i < 1000; i++) {
            ++frequency[1 + rd.nextInt(6)];

        }
        System.out.println("Face\tFrequency");

        for(int i =1;i<frequency.length;i++){
            System.out.println(i+"\t\t"+frequency[i]);
        }

    }
}
