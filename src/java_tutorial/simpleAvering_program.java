package java_tutorial;

import java.util.Scanner;

public class simpleAvering_program {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter ur 10 numbers: ");

    int total = 0;
    int grade;
    int average;
    int counter = 0 ;

    while(counter < 10){
        grade = sc.nextInt();
        total = total + grade;
        counter++;

        }
    average = total/10;
        System.out.println("your average is : " +average);
    }

}

