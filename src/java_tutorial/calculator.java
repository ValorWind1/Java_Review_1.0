package java_tutorial;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x,y,result;

        System.out.println("Enter number: ");

        x = sc.nextDouble();

        System.out.println("Enter second number: ");
        y = sc.nextDouble();

        result = x + y;

        System.out.println("the answer is :"+result);


    }
}
