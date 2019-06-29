package java_tutorial.Arrays;

public class Arrays_in_Methods {
    public static void main(String[] args) {

        int sports [] = {3,4,5,6,7,8};

        change(sports);

        for(int y : sports){
            System.out.println(y);
        }

    }

        // OUTSIDE OF MAIN METHOD
    public static void change(int x[]){
        for(int counter=0;counter<x.length;counter++){
            x[counter] += 5;
        }

    }

}
