package java_tutorial;

public class Break_Continue {

    public static void main(String[] args) {

        // you can use them in  a WHILE loop and a FOR loop

        for(int i = 0 ; i < 100 ; i ++){
            System.out.println(i);
            if ( i == 7){
                break ;  // BREAK WILL breaks out of the for loop
            }

        }

        //
        for(int i = 0 ; i < 100 ; i ++){

            if ( i == 7){
                continue ;  // Continue will keep going , and SKIP 7 .
            }
            System.out.println(i);

        }

        // check if its even , and prints all ODDS # .
        for(int i = 0 ; i < 100 ; i ++){

            if ( i % 2 == 0 ){ // even
                continue ;  //  skips all even numbers .
            }
            System.out.println(i);

        }

    }
}
