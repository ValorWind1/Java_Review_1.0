package java_tutorial.Arrays;

public class ArrayTable {
    public static void main(String[] args) {

        System.out.println("Index\tValue");  // \t = tab

        int sports [] = {2,3,4,5,6,7};

        for(int counter=0;counter<sports.length;counter++){

            System.out.println(counter + "\t\t" + sports[counter]);
        }

    }
}
