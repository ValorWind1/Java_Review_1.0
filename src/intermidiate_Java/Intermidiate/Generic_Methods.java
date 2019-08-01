package intermidiate_Java.Intermidiate;

public class Generic_Methods {
    public static void main (String args[]){

        // Generic Methods = Way to eliminate overloading methods

        // example of overloading method , and its issues
        //  such as : if many overload methods with different types
        // we would have to build many methods with each its own type
        Integer [] array1 = {1,2,3,4};
        Character [] array2 = {'b','u','a','y'};

        printMe(array1);
        printMe(array2);
    }
    /**
     * Gneneric Method
     */
    public static <T> void printMe(T[] x){

        for(T i: x){
            System.out.printf("%s ",i);

        }
        System.out.println();

    }


    /**
     * Overloading methods : for example
     */
//    public static void printMe(int[] i){
//        for(int x: i){
//            System.out.printf("%d",x);
//        }
//        System.out.println();
//    }
//    public static void printMe(Character[] i){
//        for(char x: i){
//            System.out.printf("%s",x);
//        }
//        System.out.println();
//    }
}
