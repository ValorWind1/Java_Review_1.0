package java_tutorial.Casting;

public class casting {
    // casting is forcing conversion of one type to another by prefixing an expression with (type)

    public static void main(String[] args) {

        int a = 2;
        double b= 3 ;
        int total = 0 ;

        // without casting
        System.out.println(a*b);

        // with casting
        total = (int) (a * b);
        System.out.println(total);


    }

}
