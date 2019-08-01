package java_tutorial;


import java.util.Scanner;
import java.io.IOException;

public class calculater1_0 {
    public static void main(String[] args) throws IOException {

        char choice ;
        double f,s,total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number: ");
        f = sc.nextDouble();

        System.out.println("Enter your Second Number : ");
        s =sc.nextDouble();

        System.out.println("Please pick what operation you want to do: ");
        System.out.println("1 : Add");
        System.out.println("2 : Subtract");
        System.out.println("3 : multiplication");
        System.out.println("4 : division");
        choice = (char)System.in.read();

        switch(choice){
            case '1' :
                total = f + s;
                System.out.println(total);
                break;
            case '2':
                total = f - s;
                System.out.println(total);
                break;
            case '3':
                total = f * s ;
                System.out.println(total);
                break;
            case '4':
                total = f / s;
                System.out.println(total);
                break;

                default:
                    System.out.println("Option Not available pick a number from 1 - 4 ");
                    break;



        }




    }
}
