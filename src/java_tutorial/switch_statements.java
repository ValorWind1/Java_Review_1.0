package java_tutorial;

public class switch_statements {

    public static void main(String[] args) {

        // switch statement = tests 1 variable , and depending on the variable it gives us choices
        int age;
        age = 7;


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

        default: // every switch statement has DEFAULT , in case all values were False.
            System.out.println("I don't know your age");
        break;

        }


    }
}
