package java_tutorial.Arrays;

public class Multidimensional_Arrays {
    public static void main(String[] args) {  // GOOD TO MAKE TABLES OR COORDINATES

        int firtarray[][] = {{8,9,20,11},{12,45,76,69}};       // first [] = ROW , second [] = COLUMN

        // firstarray [0] [1]  // calling them

        int secondarray [] [] = {{20,21,22,23},{43},{4,5,6}};  // 3 ROWS

        System.out.println("This is the first Array ");
        display(firtarray);

        System.out.println("This is the second array");
        display(secondarray);

    }

    public static void display(int x [] []){

        for(int row=0;row<x.length;row++){
            for(int column=0;column<x[row].length;column++){
                System.out.print(x[row][column]+"\t");
            }
            System.out.println();
        }

    }

}
