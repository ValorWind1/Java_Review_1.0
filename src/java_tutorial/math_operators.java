package java_tutorial;

import java.util.Scanner;

public class math_operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int girls,boys,people;
        girls = 7;
        boys = 3;
        people = girls % boys;

        System.out.println(people);

    }
}
