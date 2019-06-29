package java_tutorial;

public class variable_length_arguments {

    public static void main(String[] args) {

        System.out.println(average(1,2,3,4,5,6,7,8,9,9,100,200,300));

    }

    public static int average (int ... numbers ) {  // ... = not limit to numbers

        int total = 0 ;

        for(int x: numbers){
            total += x;

        }
        return total/numbers.length;
    }
}
