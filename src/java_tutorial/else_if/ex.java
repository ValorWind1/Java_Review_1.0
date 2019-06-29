package java_tutorial.else_if;

public class ex {
    public static void main(String[] args) {
        int age = 45;

       if(age >= 60)
           System.out.printf("senior");

       else if( age >=50)
           System.out.println("50s");

       else if( age >=40)
           System.out.println("40s");

       else
           System.out.println("young blood ");
    }
}
