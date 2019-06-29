package java_tutorial;

import java.util.Scanner;

public class increment_operators {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int tuna = 5;
        int bass = 18;

        tuna += 8;
        ++tuna;

        System.out.println(tuna);
        System.out.println(++tuna);
        System.out.println(--tuna);

    }

}
