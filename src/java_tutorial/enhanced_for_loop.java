package java_tutorial;

public class enhanced_for_loop {
    public static void main(String[] args) {
        int sports [] = {4,5,6,7,};
        int total = 0;

        for (int x  : sports){  // especial for loop statement , takes 2 arguments.
                            // the first takes the type and identifier what variable you want the array values to be stored in
                            // the second one is the array that you are working with

            total += x;

        }

        System.out.println(total);
    }
}
