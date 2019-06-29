package java_tutorial;

import java.sql.SQLOutput;

public class switch_statements {

    public static void main(String[] args) {

        // switch statement = tests 1 variable , and depending on the variable it gives us choices
        int age;
        age = 5;


        switch(age){

            case 1:
                System.out.println("You can crawl");
                break;
            case 2 :
                System.out.println("You can talk");
                break;
            case 3 :
                System.out.println("you can get in trouble");
                break;

        default:
            System.out.println("I dont know your age");
        break;

        }


    }
}
