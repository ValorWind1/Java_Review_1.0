package java_tutorial;

import java.util.Scanner;

public class exception_Handling {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int x = 1;


        do {
            try {  // try is a keyword
                System.out.println("Enter integer: ");
                int int1 = sc.nextInt();


                System.out.println("Enter integer: ");
                int int2 = sc.nextInt();

                int div = int1 / int2;

                System.out.println(div);
                x=2;

            } catch (Exception e) {
                System.out.println("Dont divide by 0");
            }
        }while (x==1);

    }

}
