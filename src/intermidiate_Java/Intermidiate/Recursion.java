package intermidiate_Java.Intermidiate;

public class Recursion {
    public static void main (String args []){

        // recursion = method that calls itself

        System.out.println(fact(5));
    }

    public static long fact ( long n ){

        if ( n <= 1 ){
            return 1;
        }else {
            return n * fact(n-1);
        }
    }
}
