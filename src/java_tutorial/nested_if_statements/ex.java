package java_tutorial.nested_if_statements;

public class ex {
    public static void main(String args[]) {

        int age = 60;

        if (age < 50) {
            System.out.println("You are Young");

        } else {
            System.out.println("You are old");

            if (age > 75){
                System.out.println("You are realy old");
            }else{
                System.out.println("dont worry be happy");
            }
        }
    }
}