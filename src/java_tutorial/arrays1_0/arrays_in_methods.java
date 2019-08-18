package java_tutorial.arrays1_0;

public class arrays_in_methods {

    public static void main(String[] args) {
        int a [] = {1,2,4,5,6,7};

        change(a);

        for(int i : a){
            System.out.println(i);
        }


    }

    public static void change(int x[]){

        for(int i =0;i<x.length;i++) {
            x[i] += 5;
        }
    }
}
