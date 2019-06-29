package java_tutorial.multipleMethods_and_instances;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        tuna tunaObject = new tuna();

        System.out.println("Enter name of first gf");

        String temp = sc.nextLine();

        tunaObject.setName(temp);

        tunaObject.saying();

    }

}
